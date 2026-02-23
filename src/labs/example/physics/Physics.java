/*
@Author: Landon Goggans
@Date: 2/9/2026
@Purpose: To show off Physics equations and calculations
*/

package labs.example.physics;
import java.lang.Math;

public class Physics{

    //Value for gravity (m/s^2)
    final static double GRAVITY = 9.81;

    //Calculates distance using x = v * t
    public double getDistance(double v, double t){
        double x = v * t;
        return x;
    }

    //Calculates velocity using v = x / t
    public double getVelocity(double x, double t){
        double v = x / t;
        return v;
    }

    //Calculates momentum using p = m * v
    public double getMomentum(double m, double v){
        double p = m * v;
        return p;
    }

    //Calculates force using f = m * a
    public double getForce(double m, double a){
        double f = m * a;
        return f;
    }

    //Calculates work using w = f * d
    public double getWork(double f, double d){
        double w = f * d;
        return w;
    }

    //Calculates angle using atan2
    public double getAngle(double opposite, double adjacent){
        return Math.toDegrees(Math.atan2(opposite, adjacent));
    }

    //Logs invalid angle information
    public void logInvalidAngleInfo(double angle){
        System.out.println("logging the angle " + angle + " degrees. This is not a right angle.");
    }

    //Logs valid angle information
    public void logValidAngleInfo(double angle){
        System.out.println("logging the angle " + angle + " degrees. This is a valid 3-4-5 triangle.");
    }

    //Calculates speed of light in miles per hour
    public double getLightSpeedInMPH(){
        return 186282 * 3600; // 186282 miles per second * 3600 seconds per hour
    }

    //Calculates time from Sun to Earth in hours
    public double getTimeFromSunToEarthInHours(){
        double distanceToEarth = getKnownDistanceToEarth();
        return distanceToEarth / getLightSpeedInMPH();
    }

    //Logs invalid distance from Earth to Sun
    public void logEarthToSunInvalidDistance(double new_distance){
        System.out.println("logging the distance " + new_distance + " miles. This is not the correct distance from the Earth to the Sun.");
    }

    //Returns known distance from the Earth to the Sun
    public double getKnownDistanceToEarth(){
        return 92947266.72;
    }
}