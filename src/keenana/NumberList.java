/*
 * Course: CSC1110 - 131
 * Fall 2023
 * Homework 13
 * Name: Andrew keenan
 * Last Updated: 11-30-23
 */
package keenana;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A class that stores integers and calculates the mean and average of the integers
 */
public class NumberList {
    private static final int LIST_SIZE = 20;
    private int[] numList;
    private int size;

    /**
     * Constructor for a NumberList
     */
    public NumberList() {
        numList = new int[LIST_SIZE];
        size = 0;
    }

    /**
     * Gets a series of whole numbers from the user and
     * stores them in the list
     * @throws IndexOutOfBoundsException if the user attempts to enter in more than 20
     * numbers
     */
    public void readNumbers() throws IndexOutOfBoundsException {
        boolean done = false;
        while (!done) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a series of up to " + LIST_SIZE +
                " whole numbers separated by a space: ");
            String userInput = in.nextLine();
            in = new Scanner(userInput);
            String s = "null";
            while (in.hasNext()) {
                try{
                    s = in.next();
                    numList[size] = parseInput(s);
                    size++;
                } catch (NumberFormatException e){
                    System.out.println("Bad input: "+e.getMessage());
                }
            }
            done = true;
        }
    }

    private int parseInput(String input) throws InputMismatchException{
        return Integer.parseInt(input);
    }

    /**
     * Calculates the mean of the list
     *
     * @return the mean of the list
     */
    public int getMean() {
        int sum = 0;
        for (int i : numList) {
            sum += i;
        }
        return sum / size;
    }
}
