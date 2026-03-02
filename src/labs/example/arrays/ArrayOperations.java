/*
@Author: Landon Goggans
@Date: 3/2/2026
@Purpose: Tests Arrays
*/

package labs.example.arrays;

public class ArrayOperations{
    public static void main(String[] args) {
        //Assigns the integer 3 to ARREY
        final int ARREY = 3;
        int[] hours = new int[ARREY];

        //Creates a copy of Type
        Type keyboard = new Type(System.in);
        System.out.println("Enter the hours counted by " + ARREY + "today.");

        for (int index = 0; index < ARREY; index++) {
            System.out.println("Today " + (index + 1) + ": ");
            hours[index] = keyboard.nextInt();
        }

        System.out.println("The hours you entered are:");


        System.out.println("I created a new array and it now has X items in it.");
        System.out.println("The array items aand their values are listed below: X");
    }
}