import java.util.Scanner;
public class SphereVolume { 
public static void main(String[] args) { 
	// add your declaration and code here 
	double diam;
	Scanner userInput = new Scanner(System.in);
	System.out.print("Please enter the diameter of a sphere here: ");
	diam = userInput.nextDouble();
	double radius = diam / 2.0;
	double sphereVolume = 4.0 * Math.PI * Math.pow(radius, 3) / 3.0;
	System.out.println("The volume of a sphere is: " + sphereVolume);
	} 
} 
