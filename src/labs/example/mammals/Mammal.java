/*
@Author: Landon Goggans
@Date: 2/1/2026
@Purpose: To show off my mammal's properties and methods
*/

package labs.example.mammal;

public class Mammal
{
    //Properties for my mammal
    private String hairColor;
    private String eyeColor;
    private double bodyTemp;
    private int lifespan;
    private double weight;
    private double height;

    //My mammal's methods
    public void run()
    {
        System.out.println("The mammal is running.");
    }

    public void eat()
    {
        System.out.println("The mammal is eating.");
    }

    public void sleep()
    {
        System.out.println("The mammal is sleeping in its home.");
    }

    public void scratch()
    {
        System.out.println("The mammal scratched its prey.");
    }

    public void fight()
    {
        System.out.println("The mammal can fight for itself.");
    }

    public void drink()
    {
        System.out.println("The mammal is drinking water.");
    }

    public void breathe()
    {
        System.out.println("The mammal is out of breath.");
    }

    public void move()
    {
        System.out.println("The mammal is moving toward its house.");
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

    public int walk()
    {
        int south = 3;
        int east = 4;

        System.out.println("The mammal walks 3 miles south.");
        System.out.println("The mammal turns right and walks 4 miles east.");

        int distanceFromStart = (int) Math.sqrt((south * south) + (east * east));

        System.out.println("The mammal is now " + distanceFromStart + " miles away from the starting point in a straight line.");

        double thetaRadians = Math.atan2(southMiles, eastMiles);
        double thetaDegrees = Math.toDegrees(thetaRadians);

        System.out.println("The angle (theta) at the longest leg is " + thetaDegrees + " degrees.");

        return distanceFromStart;
    }
}