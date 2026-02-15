/*
@Author: Landon Goggans
@Date: 2/11/2026
@Purpose: Main class file for physics
*/

package labs.example.physics;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        Physics physics = new Physics();

        double distance = physics.getDistance(15, 4);
        System.out.println("Distance: " + distance + " miles");

        double velocity = physics.getVelocity(80, 2);
        System.out.println("Velocity: " + velocity + " mph");

        double momentum = physics.getMomentum(500, 60);
        System.out.println("Momentum: " + momentum + " kg m/s");

        double force = physics.getForce(12, 4);
        System.out.println("Force: " + force + " kg m/s^2");

        double work = physics.getWork(20, 10);
        System.out.println("Work: " + work + " Joules");
    }
}