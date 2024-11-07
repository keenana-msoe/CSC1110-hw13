/*
 * Course: CSC1110 - 131
 * Fall 2023
 * Homework 13
 * Name: Andrew keenan
 * Last Updated: 11-30-23
 */
package keenana;



/**
 * Driver that will create a NumberList, fill it, and return the mean
 * value of the list
 */
public class NumberListDriver {
    public static void main(String[] args) {
        NumberList list = new NumberList();
        try {
            list.readNumbers();
            System.out.println("Mean = " + list.getMean());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You may only enter 20 values.");
        } catch (ArithmeticException e){
            System.out.println("No valid values entered");
        }

    }
}
