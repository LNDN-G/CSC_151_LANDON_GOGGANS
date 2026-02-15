/*
@Author: Landon Goggans
@Date: 2/14/2026
@Purpose: To show off my lion's properties and methods
*/

package labs.example.mammals;

public class Lion extends Mammal
{
    //Lion Roar method
    public void roar()
    {
        System.out.println("The lion roared out loud.");
    }

    //Constructor for Lion
    public Lion(String hairColor, String eyeColor, double bodyTemp, int lifespan, double weight, double height, boolean canRoar)
    {
        super(hairColor, eyeColor, bodyTemp, lifespan, weight, height, canRoar);
    }
}