/*
@Author: Landon Goggans
@Date: 2/23/2026
@Purpose: 
*/

package labs.example.loops;

public class WhileLoop{

    public static void main(String[] args) {

        WhileLoop loop = new WhileLoop();
        loop.WhileLoop();
    }

    private void WhileLoop() {

        int count = 0;

        while (count < 10) {
            count++;
        }

        System.out.println("Number of iterations: " + count);
        System.out.println("The loop is now complete.");
    }
}