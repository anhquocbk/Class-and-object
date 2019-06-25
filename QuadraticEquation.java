package Bai3;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter a: ");
        a = scanner.nextDouble();

        System.out.println("Enter b: ");
        b = scanner.nextDouble();

        System.out.println("Enter c: ");
        c = scanner.nextDouble();

        Account account = new Account();
        account.setABC(a,b,c);
        if (account.getDiscriminant() > 0) {
            System.out.println("Root 1 = " + (- account.getB() + Math.sqrt(account.getDiscriminant()))/(2*account.getA()));
            System.out.println("Root 2 = " + (- account.getB() - Math.sqrt(account.getDiscriminant()))/(2*account.getA()));
        } else if (account.getDiscriminant() == 0) {
            System.out.println("The equation has a root = " + (-b)/(2*a));
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
class Account {
    private double a,b,c;
    public Account(){

    }
    public void setABC(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getDiscriminant(){
        return  b*b - 4*a*c;
    }
}
