/*
@Author: Landon Goggans
@Date: 2/9/2026
@Purpose: To show off Physics
*/

package labs.example.physics;
import java.lang.Math;

public class Physics{

    final static double GRAVITY = 9.81;

    public double getDistance(double v, double t){
        double x = v * t;
        return x;
    }

    public double getVelocity(double x, double t){
        double v = x / t;
        return v;
    }

    public double getMomentum(double m, double v){
        double p = m * v;
        return p;
    }

    public double getForce(double m, double a){
        double f = m * a;
        return f;
    }

    public double getWork(double f, double d){
        double w = f * d;
        return w;
    }
}