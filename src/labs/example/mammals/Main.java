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
        //Basic Mammals
        Mammal mammalbasic = new Mammal("Black", "Brown", 101.5, 13, 79.0, 24.0, false);

        //Mammal details, sit, and walk methods
        mammalbasic.getMammalDetails();
        mammalbasic.sit(); //Mammal sits down
        mammalbasic.walk(7); //Mammals walk 7 miles
        
        System.out.println();
        
        //Lion (inherits traits from the mammals and can roar)
        Lion Mufasa = new Lion("Brown", "Amber", 101.3, 14, 420.0, 45.0, true);

        //Lion details, sit, walk, and roar methods
        Mufasa.getMammalDetails();
        Mufasa.sit(); //Lion sits down
        Mufasa.roar(); //The lion roars out loud
        Mufasa.walk(7); //Lion walks 7 miles
    }
}