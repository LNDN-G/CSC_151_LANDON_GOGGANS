/*
@Author: Landon Goggans
@Date: 2/1/2026
@Purpose: To show off my mammal's properties
*/

package labs.example.mammal;

public class Mammal
{
    //Properties
    private String hairColor;
    private String eyeColor;
    private double bodyTemp;
    private int lifespan;
    private double weight;
    private double height;

    //Methods
    public void run()
    {
        System.out.println("The mammal can run.");
    }

    public void eat()
    {
        System.out.println("The mammal does eat.");
    }

    public void sleep()
    {
        System.out.println("The mammal goes to sleep at night.");
    }

    public void scratch()
    {
        System.out.println("The mammal can scratch.");
    }

    public void fight()
    {
        System.out.println("The mammal can fight for itself.");
    }

    public void drink()
    {
        System.out.println("The mammal can drink.");
    }

    public void breathe()
    {
        System.out.println("The mammal does breathe.");
    }

    public void move()
    {
        System.out.println("The mammal can move around.");
    }

    public void reproduce()
    {
        System.out.println("The mammal can reproduce.");
    }

    //New Methods
    public void getMammalDetails() 
    {
        System.out.println("Hair Color: " + hairColor);
        System.out.println("Eye Color: " + eyeColor);
        System.out.println("Body Temperature: " + bodyTemp);
        System.out.println("Lifespan: " + Lifespan);
        System.out.println("Weight: " + Weight);
        System.out.println("Height: " + Height);
    }

    public void sit() 
    {
        System.out.println("The mammal is sitting");
        try 
        {
            Thread.sleep(15000); //sit for 15 seconds
        }
        catch (InteruptionException e) 
        {
            System.out.println("The sitting was interrupted.");
        }
        stand();
    }

    public void stand() 
    {
        System.out.println("The mammal is standing.");
    }
}