package lab6_assign5_template;

import java.util.*;

public class ChangeDispenser {

    // public wrapper
    // NOTE - your wrapper method does NOT have to be a void method.
    public static void makeChange(int amount) {
        // add your code

        // Hints:
        // Use a list to store the denomination values of coins in decreasing order.
        // //100, 50, 25, 10, 5, 1
        // //$, 50c, 25c, 10c, 5c, 1c
        // Use a second list to store the names of coins in the same order as their
        // denomination value list.
        // //"DOLLAR", "HALF-DOLLAR", "DIME"...

        List<Integer> coinValues = new ArrayList<>(Arrays.asList(100, 50, 25, 10, 5, 1));
        List<String> coinNames = new ArrayList<>(Arrays.asList("DOLLAR", "HALF_DOLLAR", "QUARTER", "DIME", "NICKEL", "PENNY"));

        // call the private recursive counterpart and pass the corresponding
        // arguments.
        makeChange(amount, coinValues, coinNames);
    }

    // $, 50c, 25c, 10c, 5, 1c
    // dollar, half-dollar,
    // private static void makeChange(parameter list) {
    // private recursive counterpart
    // NOTE - your recursive method does NOT have to be a void method.
    // example:
    // private static void makeChange(parameter list) {
    private static void makeChange(int amount, List<Integer> coinValues, List<String> coinNames) {
        // HintS -
        // Your recursive method uses the coin value list and the coin name list.
        // In each call to the recursive method, the count of the first coin in the list
        // (coin in largest denomination value) is calculated and printed out.
        // Required: print singular or plural names based on coin count.
        // e.g. 1 PENNY, 2 PENNIES, etc.
        // Then the first coin is removed from both lists.
        // The remaining amount of money is calculated.
        // The coin lists and the remaining amount are passed to the next recursive
        // call.
        // The recursion ends when no money is left.

        if (amount == 0 || coinValues.isEmpty()) {
            return;
        }

        int coinValue = coinValues.get(0);
        String coinName = coinNames.get(0);

        int count = amount / coinValue;

        if (count > 0) {
            if (count == 1) {
                if (coinName.equals("PENNY")) {
                    System.out.println("1 PENNY");
                } else {
                    System.out.println("1 " + coinName);
                }
            } else {
                if (coinName.equals("PENNY")) {
                    System.out.println(count + " PENNIES");
                } else {
                    System.out.println(count + " " + coinName + "s");
                }
            }
        }

        int remaining = amount % coinValue;

        coinValues.remove(0);
        coinNames.remove(0);

        makeChange(remaining, coinValues, coinNames);
    }

    // print: count, demoniation: PENNY, PENNIES

    public static void main(String[] args) {

        // add your code to do the following:

        // prompt the user to enter the amount in dollars and cents
        // get the amount
        // convert the amount to all cents
        // call the public wrapper method

        // NOTE -
        // test your code using $2.93, $0.91, $0.78, $0

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the money amount in dollars and cents: ");
        double amount = scanner.nextDouble();

        int totalCents = (int) Math.round(amount * 100);

        makeChange(totalCents);

        scanner.close();
    }

}