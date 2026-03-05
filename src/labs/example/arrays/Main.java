/*
@Author: Landon Goggans
@Date: 3/2/2026
@Purpose: Tests the methods in the ArrayOperations file
*/

package labs.example.arrays;

public class Main
{
    public static void main(String[] args)
    {
        ArrayOperations arrayOps = new ArrayOperations();

        arrayOps.createNewArray(10);

        int[] unsortedArray = {
            58, 43, 10, 47, 64, 19, 82, 31, 74, 5, 
            99, 25, 60, 8, 93, 14, 70, 37, 88, 21, 
            59, 2, 68, 41, 97, 13, 50, 29, 84, 6, 
            72, 39, 65, 27, 44, 1, 98, 76, 32, 54, 
            11, 89, 67, 23, 56, 34, 90, 3, 78, 12
        };

        arrayOps.sortArray(unsortedArray);

        arrayOps.getDaysAndMonths();
    }
}