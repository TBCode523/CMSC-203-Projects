import java.util.Scanner;
/*
 * Temperature and wind chill converter
 * Programmer Name: Talal Brek
 * Date: 1/30/2020
 */
public class WindChill {
public static void main(String args[]) {
	final double CONSTANT1 = 35.74;
	final double CONSTANT2 = 0.6215;
	final double CONSTANT3 = 35.75;
	final double CONSTANT4 = 0.4275;
	double temp;
	double windSpeed;
	double windChill;
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter value for temperature (-45 to 40 respectively)");
	temp= s.nextDouble();
	System.out.println("Enter value for wind speed (5 to 60mph respectively)");
	windSpeed = s.nextDouble();
	windChill = CONSTANT1 + (CONSTANT2*temp) - (CONSTANT3*Math.pow(windSpeed, 0.16)) + temp*CONSTANT4*Math.pow(windSpeed, 0.16);
	System.out.println("The Wind Chill is: " + windChill + " degrees Farenheit");
	s.close();
}
}
