/*
@Author: Landon Goggans
@Date: 2/23/2026
@Purpose: Uses for loops to execture methods
*/

package labs.example.loops;

public class ForLoop {

    public static void main(String[] args) {

        //Creates a ForLoop object
        ForLoop loop = new ForLoop();
        //Tests ForLoop method
        loop.ForLoop();

        //Tests sumTwoNumbers method and decrements the result
        int result = loop.sumTwoNumbers(20, 15);
        int decrementedResult = --result;
        System.out.println("The decremented result is: " + decrementedResult);

        //Tests sumLoopCounter method
        int sumResult = loop.sumLoopCounter(20);
        System.out.println("The sum of the loop counter is: " + sumResult);

        //Tests printMultiplicationTable method
        loop.printMultiplicationTable(5);
    }
    //Private method that uses a for loop counting from 0 to 19
    private void ForLoop() {
        //Uses a for loop to count from 0 to 19 and prints the number of iterations
        for (int count = 0; count < 20; count++) {
            System.out.println("Number of loop iterations: " + count);
        }
    }
    //Method that takes two integers as arguments and returns the sum
    private int sumTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }

    //Method that takes an integer as an argument and returns the sum of the loop counter from 0 to that number
    private int sumLoopCounter(int number) {
        int sum = 0;
        //Uses a for loop to sum the loop counter from 0 to the given number
        for (int count = 0; count < number; count++) {
            sum += count;
        }
        return sum;
    }
    //Method that takes an integer as an argument and prints the multiplication table for that number from 0 to 12
    private void printMultiplicationTable(int number) {
        System.out.println("Multiplication Table for " + number + ":");

        //Uses a for loop to print the multiplication table for the given number from 0 to 12
        for (int count = 0; count <= 12; count++) {
            System.out.println(number + " x " + count + " = " + (number * count));
        }
    }
}