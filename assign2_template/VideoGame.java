package assign2_template;

//newer Java API for handling date values
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class VideoGame implements Comparable<VideoGame> {

    // 2.2.1 Entity Class - VideoGame

    private static final int DEFAULT_NUMBER_OF_PLATFORMS = 5;

    // data fields
    private String title;
    private String developer; // lead developer
    private String platforms[];
    private LocalDate releaseDate;

    @Override
    public String toString() {
        // date is formatted to US ------------>
        // add your code
        // return a string including all infor. about a game

        // See examples in: Animal class, Computer class

        // date value included in format: 9/15/2020 for Sep. 15, 2020

        // display date values in US format:
        // Get a DateTimeFormatter object with the specified pattern
        // Use the DateTimeFormatter object to call format(..) method.

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("M/d/yyyy");

        return "title: " + title + "\ndeveloper: " + developer + "\nplatforms: "
                + Arrays.toString(platforms) + "\nrelease date: " + dateFormatter.format(releaseDate)
                + "\n ---------------------";

    }

    @Override
    public boolean equals(Object otherObject) { // when override a method you must write type of the parameter
                                                // not name of the class. not like (VideoGame otherVideoGame)
        // add your code
        // comparing two VideoGame objects based only on title

        // same identity
        if (this == otherObject) {
            return true;
        }

        // if null
        if (otherObject == null) {
            return false;
        }

        // different identity
        if (this != otherObject) {
            return false;
        }
        // see example in DirectoryEntryV2.java in pkg: arraylist

        return this.title.equals(((VideoGame) otherObject).title); // you must cast when you return the outcome. because
                                                                   // Object otherObject does not have a title field
    }

    // ******The following code don't need to be changed.*****//

    // You don't need to change this method.
    // This method is used in adding VideoGame.
    @Override
    public int compareTo(VideoGame other) {
        return this.title.compareTo(other.title);
    }

    // no-argument constructor
    public VideoGame() {
        platforms = new String[DEFAULT_NUMBER_OF_PLATFORMS];
    }

    // constructor taking in values for all data fields
    public VideoGame(String title, String developer, String[] platforms, LocalDate releaseDate) {
        this.title = title;
        this.developer = developer;
        this.platforms = platforms;
        this.releaseDate = releaseDate;
    }

    // getters

    public int getDefLength() {
        return DEFAULT_NUMBER_OF_PLATFORMS; // ------ i needed the default platform legnth so i made getter for this
    }

    public String getTitle() {
        return title;
    }

    public String getDeveloper() {
        return developer;
    }

    public String[] getPlatforms() {
        return platforms;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    // setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public void setPlatforms(String[] platforms) {
        this.platforms = platforms;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
