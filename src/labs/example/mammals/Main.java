/*
@Author: Landon Goggans
@Date: 2/11/2026
@Purpose: First main class file for java
*/

package labs.example.mammals;

public class Main 
{
    public static void main(String[] args) throws InterruptedException
    {
        Mammal mammalbasic = new Mammal("Brown", "Black", 101.5, 150.0, 3, false);

        mammalbasic.getMammalDetails();
        mammalbasic.sit();
        mammalbasic.walk(3);
        
        System.out.println();
        
        Lion Mufasa = new Lion("Yellow", "Brown", 101.3, 420.0, 5, true);
        
        Mufasa.getMammalDetails();
        Mufasa.sit();
        Mufasa.walk(4);
    }
}