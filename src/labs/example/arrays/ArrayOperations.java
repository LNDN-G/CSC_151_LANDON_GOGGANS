/*
@Author: Landon Goggans
@Date: 3/2/2026
@Purpose: Tests Arrays
*/

package labs.example.arrays;

public class ArrayOperations{

    //Creates a new array 
    public void createNewArray(int size) {

        //Creates a new array of integers
        int[] newArray = new int[size];

        //Uses a for loop to populate the array with values based on the index
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] += i;
        }

        System.out.println("I created a new array and it now has " + newArray.length + " items in it.");
        System.out.println("The array items and their values are listed below:");

        //Calls the displayArray method to print the items in the array
        displayArray(newArray);
    }

    //Displays the items in the array
    private void displayArray(int[] array) {

        //Uses a for loop to print the index and value of each item in the array
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + " = " + array[i]);
        }
    }

    //Sorts the array in ascending order
    public void sortArray(int[] array) {

        int n = array.length;
        int temp;

        //Uses bubble sort method to sort array
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (array[j] > array[j + 1]) {

                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("The sorted array is:");

        //Uses a for loop to print the sorted array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    //Displays the number of days in each month
    public void getDaysAndMonths() {

        int[] days = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        //Uses a for loop to print the number of days in each month
        for (int i = 0; i < months.length; i++) {
            System.out.println("There are " + days[i] + " days in " + months[i]);
        }
    }
}
