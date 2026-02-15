/*
@Author: Landon Goggans
@Date: 2/1/2026
@Purpose: To show off my mammal's properties and methods
*/

package labs.example.mammals;

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

    //Displays mammals details
    public void getMammalDetails() 
    {
        System.out.println("Hair Color: " + hairColor);
        System.out.println("Eye Color: " + eyeColor);
        System.out.println("Body Temperature: " + bodyTemp);
        System.out.println("Lifespan: " + lifespan);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
    }

    //Sit method
    public void sit() throws InterruptedException 
    {
        System.out.println("The mammal is sitting");
        Thread.sleep(15000); //sit for 15 seconds
        stand();
    }

    //Stand method
    public void stand() 
    {
        System.out.println("The mammal is standing.");
    }

    //Walk method
    public double walk(double miles)
    {
        System.out.println("The mammal walked " + miles + " miles.");
        return miles;
    }

    //Consturctor for mammal
    public Mammal(String hairColor, String eyeColor, double bodyTemp, int lifespan, double weight, double height, boolean canRoar)
    {
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.bodyTemp = bodyTemp;
        this.lifespan = lifespan;
        this.weight = weight;
        this.height = height;
    }
}