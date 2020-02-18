package _solution;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        // write your code here
        double diameter;
        double radius;
        double volume;
        final double PI = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the diameter of the sphere");
        diameter = scanner.nextDouble();
        radius = diameter/2;
        volume = Math.PI * (4.0/3) * Math.pow(radius,3);
        System.out.println(volume);

        scanner.close();
    }
}
