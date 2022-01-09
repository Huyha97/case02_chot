package buoi04;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Fan {
    final double SLOW    = 1;
    final double MEDIUM  = 2;
    final double FAST    = 2;
    private int speed;
    private boolean on = false;
    private double radius = 5;
    private String color;

    public Fan() {
    }
    public void turnOn() {
        on = true;
    }
    public void turnOff() {
        on = false;
    }


    public double getSLOW() {
        return SLOW;
    }

    public double getMEDIUM() {
        return MEDIUM;
    }

    public double getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }


    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

//    public void setOn(boolean on) {
//        this.on = on;
//    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on) {
           return  "fan is on " + "; speed is " + this.speed + "; color is"  + this.color +"; radius is" + this.radius;
        } else {
            return "fan is off " + "; color is "  + this.color +"; radius is " + this.radius;
        }
    }
}
class runFan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //fan 01
        Fan fan1 = new Fan();
        fan1.turnOn();
        fan1.setColor("yellow");
        fan1.setRadius(10);
        fan1.setSpeed(3);
        System.out.println(fan1);
        //fan 02
        Fan fan2 = new Fan();
        fan1.turnOff();
        fan2.setColor("blue");
        fan2.setRadius(5);
        fan2.setSpeed(2);
        System.out.println(fan1);
    }
}
