/*
@Author: Landon Goggans
@Date: 2/23/2026
@Purpose: Shows off a while loop through a method
*/

package labs.example.loops;

public class WhileLoop{

    public static void main(String[] args) {
        //Creates a WhileLoop object
        WhileLoop loop = new WhileLoop();
        //Tests WhileLoop method
        loop.WhileLoop();
    }
    //Method that uses a while loop to count from 0 to 9 and prints the number of iterations
    private void WhileLoop() {

        int count = 0;

        while (count < 10) {
            count++; // Increments the count
        }
        //Prints number of iterations and a complete message
        System.out.println("Number of iterations: " + count);
        System.out.println("The loop is now complete.");
    }
}