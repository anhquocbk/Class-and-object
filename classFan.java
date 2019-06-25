package Bai3;

public class classFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.turnOn();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println("Speed: " + fan1.getSpeed()+ "; Color: " + fan1.getColor() + "; Radius: " + fan1.getRadius() + "; Fan is on");

        Fan fan2 = new Fan();
        fan2.turnOff();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("blue");
        System.out.println("Speed: " + fan2.getSpeed()+ "; Color: " + fan2.getColor() + "; Radius: " + fan2.getRadius() + "; Fan is off");
    }
}
class Fan {
    private boolean on = false;
    private int speed = 1;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }
    public void turnOn() {
        on = true;
    }
    public void turnOff() {
        on = false;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
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

}