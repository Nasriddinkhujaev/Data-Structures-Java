package assign2_template;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException; // to handle invalid date input
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ManageVideoGames {
    static Scanner input = new Scanner(System.in); // scanner to read user input and its static inside the class so it
                                                   // can be reached anywhere in the file
    public static int choice = 0;

    static List<VideoGame> videoGames = new LinkedList<>(); // <-- class-level store it can be reached anywhere in the
                                                            // file

    public static void main(String[] args) {

        // 2.2.2 Application Class - ManageVideoGames
        // create an empty list of VideoGames
        // outside the main
        // 1. display menu
        // 2. get user choice
        // 3. take action based on user choice
        // 4. loop through steps 1, 2, 3 above until user quits
        while (choice != 6) {

            // 1. display menu
            displayMenu();

            // 2. get user choice

            choice = getUserChoice();

            // 3. take action based on user choice
            switch (choice) {
                case 1 -> {
                    VideoGame newGame = getNewGame();
                    videoGames.add(newGame); // append to end
                }
                case 2 -> removeGame(); // remove a game
                case 3 -> displayList(); // display the games
                case 4 -> latestGame(); // find latest released game
                case 5 -> {
                    VideoGame newGame = getNewGame(); // first create the game
                    abcOrder(newGame); // then insert it alphabetically
                }
                case 6 -> System.out.println("Exiting program. Goodbye!");
                default -> System.out.println("Invalid choice. Please enter a number from 1 to 6.");
            }

            System.out.println(); // just a blank line for readability
        }
    }

    // define other methods for modularization, samples are listed below.

    // method to display menu
    public static void displayMenu() {
        // add your code
        // display the menu like the one in Page 5 of Assign2.pdf
        System.out.println(CYAN + """
                1. Add a new game
                2. Remove an existing game
                3. Display the games
                4. Find latest release
                5. Add game alphabetically
                6. Exit
                """ + RESET);
    }

    // method to get and return the user choice of menu items.
    // add your code
    // keep reading user input until user enters correct menu choice number,
    // then return the user choice number

    // method to get user input, create and return a video game
    // add your code here
    public static int getUserChoice() { // ---------------------------------------------------------- get_user_choice
        String strChoice = input.nextLine();
        choice = Integer.parseInt(strChoice);

        return choice;
    }

    // * get new game based on user input:

    // * keyboard input
    // * game title:
    // * use nextLine() to avoid problems caused by newline character
    // * platforms:
    // * get how-many: int
    // * then use a loop to get each platform.
    public static VideoGame getNewGame() {
        VideoGame newGame = new VideoGame();

        // ---------------------------------------------------------------------------------------input_1
        System.out.println(
                "enter the game title, developer, platforms (xbox, playstation etc), release date ( month/day/year) ");

        System.out.println(YELLOW + "enter game title -->" + RESET);

        String newTitle = input.nextLine();

        newGame.setTitle(newTitle);// ------------ set title

        System.out.println(YELLOW + "enter developer ---->" + RESET);
        String newDeveloper = input.nextLine();
        newGame.setDeveloper(newDeveloper); // ---------set developer

        System.out.println(
                YELLOW + "enter the number of platforms like xbox, playstation (enter 0 to skip)---> " + RESET);
        String newNumberOfPlatforms = input.nextLine();
        int numberOfPlatforms = Integer.parseInt(newNumberOfPlatforms);
        String[] platforms = new String[numberOfPlatforms];

        for (int i = 0; i < numberOfPlatforms; i++) {
            System.out.println(YELLOW + "enter platform " + (i + 1) + " ---->" + RESET);
            String platform = input.nextLine();
            platforms[i] = platform;
        }
        newGame.setPlatforms(platforms); // ----------- set platforms

        /*
         * date value:
         * get 3 integers: month, day, year
         * use LocaleDate.of(year, month, day) to create a date
         * (see TestDate.java for details)
         */
        boolean validDate = false;
        while (!validDate) {
            try {
                System.out.println(YELLOW + "Enter release date mm/dd/yyyy ------> " + RESET);
                String stringDate = input.nextLine();

                LocalDate newReleaseDate = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("M/d/yyyy"));
                newGame.setReleaseDate(newReleaseDate); // ---------- set new release date
                validDate = true;
            } catch (DateTimeParseException e) {
                System.out.println(RED + "Invalid format! Please enter mm/dd/yyyy form " + RESET);
            }
        }

        return newGame;
    }

    // method to add a video game without maintaining sorted order
    // add your own code

    // method to remove a game based on user input
    // add your own code
    public static void removeGame() { // -------------------------------------------------------------------input2

        if (!videoGames.isEmpty()) {
            System.out.println(GREEN + "which game would you like to remove? " + RESET);
            System.out.println(BLUE + videoGames + RESET);
            System.out.println(GREEN + "enter the game title -----> " + RESET);
            String removeGame = input.nextLine();
            for (VideoGame game : videoGames) {
                if (game.getTitle().equals(removeGame)) {
                    videoGames.remove(game);
                    break; // stops the loop after removing
                }
            }
        } else
            System.out.println(RED + "List is empty" + RESET);

    }

    public static void displayList() { // ------------------------------------------------------------------------------input_3
        if (!videoGames.isEmpty()) {
            for (VideoGame game : videoGames) {
                System.out.println(BLUE + game.toString() + RESET);
            }
        } else
            System.out.println(RED + "List is empty" + RESET);
        System.out.println(YELLOW + "Press Enter to return to menu" + RESET);
        input.nextLine(); // enter after done reading games list
    }
    // method to find the game with latest release date
    // add your own code
    /*
     * find game with latest release date
     * simple assumption: only one game has the latest release date.
     * need to loop through the collection and find the latest release date
     * (largest)
     * while looping,
     * record and update the current latest release date value
     * and the corresponding VideoGame object.
     * 
     * compare dates: isBefore, isAfter, or compareTo
     * (see TestDate.java for details)
     */

    public static void latestGame() { // ----------------------------------------------------------------input_4
        if (videoGames.isEmpty()) {
            System.out.println(RED + "No games in the collection." + RESET);
            return;
        }

        int indexOfLatestGame = 0;
        LocalDate latestDate = LocalDate.of(1900, 01, 01);
        for (VideoGame game : videoGames) {
            if (game.getReleaseDate().isAfter(latestDate)) {
                indexOfLatestGame = videoGames.indexOf(game);
                latestDate = game.getReleaseDate();
            }
        }
        System.out.println(GREEN + videoGames.get(indexOfLatestGame) + " is the latest game" + RESET);
        System.out.println(YELLOW + "press enter to go back to menu" + RESET);
        input.nextLine();
    }

    // OPTIONAL BONUS:
    // method to add a video game in alphabetical order of game titles
    // add your own code
    public static void abcOrder(VideoGame thisGame) {
        int correctIndex = -1; // -1 because if 0 then what if 0 is actually the correct index
        for (int i = 0; i < videoGames.size(); i++) {
            if (videoGames.get(i).getTitle().compareTo(thisGame.getTitle()) > 0) {
                correctIndex = i;
                break;
            }
        }
        if (correctIndex != -1) {
            videoGames.add(correctIndex, thisGame); // add in the correct index
        } else
            videoGames.add(thisGame); // add the game at the end of the list
        System.out.println(GREEN + "Game added in alphabetical order. \n press enter to continue" + RESET);
        input.nextLine();

    }
    /*
     * add new game in alphabetical order of game titles
     * Do not append the new game to the current collection and then sort the entire
     * collection.
     * Instead,
     * start with the first game,
     * loop through the collection and
     * find the first game whose title is alphabetically larger than the new game.
     * Then insert the new game at the location, say [j], of this target.
     * As the result of the insertion, this target will be at [j+1].
     * If no existing game title is larger than the new game,
     * append the new game to the end of game collection list.
     */

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
}
