/*
@Author: Landon Goggans
@Date: 2/23/2026
@Purpose:
*/

package labs.example.loops;

public class ForLoop {

    public static void main(String[] args) {

        ForLoop loop = new ForLoop();
        loop.ForLoop();

        int result = loop.sumTwoNumbers(15, 25);
        int dcrementedResult = --result;
        System.out.println("The decremented result is: " + dcrementedResult);
    }

    private void ForLoop() {

        for (int count = 0; count < 20; count++) {
            System.out.println("Number of loop iterations: " + count);
        }
    }

    private int sumTwoNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    //New method
    private int sumLoopCounter(int num) {
        
        for (int count = 10; count <= 10;) {
            sum = num + count
            System.out.println("The sum of the loop counter is: " + sum);
        }
    }
}