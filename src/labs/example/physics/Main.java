/*
@Author: Landon Goggans
@Date: 2/11/2026
@Purpose: Main class is used to test Physics class
*/

package labs.example.physics;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        //Creates a Physics object
        Physics physics = new Physics();

        //Calculates velocity
        double velocity1 = physics.getVelocity(80, 2);
        System.out.println("Velocity: " + velocity1 + " mph");

        //Calculates momentum
        double momentum = physics.getMomentum(500, 60);
        System.out.println("Momentum: " + momentum + " kg m/s");

        //Calculates force
        double force = physics.getForce(12, 4);
        System.out.println("Force: " + force + " kg m/s^2");

        //Calculates work
        double work = physics.getWork(20, 10);
        System.out.println("Work: " + work + " Joules");

        //Calculates angle
        double angle = physics.getAngle(3, 4);
        System.out.println("Angle: " + angle + " degrees");

        //Conditional to check if the angle is a 3-4-5 triangle
        if (angle > 37 || angle < 36.87) {
            physics.logInvalidAngleInfo(angle);
        } else {
            physics.logValidAngleInfo(angle);
        }

        //Light speed and time calculation
        double velocity = physics.getLightSpeedInMPH();
        double time = physics.getTimeFromSunToEarthInHours();

        //Calculates distance with getDistance method
        double distance = physics.getDistance(velocity, time);

        //Known distance from Sun to Earth
        double knownDistance = physics.getKnownDistanceToEarth();

        //Conditional to check if the distance is correct
        if (distance != knownDistance){
            physics.logEarthToSunInvalidDistance(distance);
        } else {
            System.out.println("The distance from the Sun to Earth is valid at " + distance + " miles.");
        }
    }
}