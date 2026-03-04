/*
@Author: Landon Goggans
@Date: 3/2/2026
@Purpose: Tests Arrays
*/

package labs.example.arrays;

public class ArrayOperations{

    public void createNewArray(int size) {

        int[] newArray = new int[size];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] += i;
        }

        System.out.println("I created a new array and it now has " + newArray.length + " items in it.");

        System.out.println("The array items and their values are listed below:");

        displayArray(newArray);
    }

    private void displayArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + " = " + array[i]);
        }
    }
}
