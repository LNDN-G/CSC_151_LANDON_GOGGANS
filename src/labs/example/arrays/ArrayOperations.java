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

    public void sortArray(int[] array) {

        int n = array.length;
        int temp;

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

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public void getDaysAndMonths() {

        int[] days = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        for (int i = 0; i < months.length; i++) {
            System.out.println("There are " + days[i] + " days in " + months[i]);
        }
    }
}
