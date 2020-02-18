package _solution;

import java.util.Scanner;

public class NumericTables {
    public static void main(String[] args) {
        // write your code here
       int score1,score2;
       double avg, tempFahrenheit;
       double converted;
        final double PI = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st score");
        score1 = scanner.nextInt();
        System.out.println("Enter the 2nd score");
        score2 = scanner.nextInt();
        avg = (score1+score2)/2.0;
        System.out.println("Enter a temperature in fahrenheit");
        tempFahrenheit = scanner.nextDouble();
        converted = (5.0/9) *(tempFahrenheit-32);
        System.out.println("The converted temperature is: " + converted + " Celsius");
        System.out.println("The average of the scores are: " + avg);
        scanner.close();
    }
}
