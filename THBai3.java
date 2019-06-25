package Bai3;

import java.util.Scanner;
public class THBai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter width: ");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your rectangle: " + rectangle.display());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}

class Rectangle {
    double width, height;

    public Rectangle() {

    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return height*width;
    }
    public double getPerimeter() {
        return (height + width)*2;
    }
    public String display() {
        return "Rectangle{" + " width " + width + ", height " + height + "}";
    }
}

