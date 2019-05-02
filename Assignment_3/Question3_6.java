//Created By Emma Seehousz on 4/16
import java.util.*;
public class Question3_6 {
	public static void main(String[] args) {
		//create new scanner object
		Scanner Scan = new Scanner(System.in);
		double weightInKilograms;
		double heightInMeters;
		double bmi;
		//ask the user for there weight in pounds
		System.out.print("Enter weight in pounds: ");
        double weight = Scan.nextDouble();
        //prompt user for height in feet 
        System.out.print("Enter feet: ");
        double feet = Scan.nextDouble();
        //prompt user for inches
        System.out.print("Enter inches: ");
        double inches = Scan.nextDouble();
        //convert all measurements to bmi
        weightInKilograms = weight * 0.45359237;
        heightInMeters = inches * 0.0254 + (feet / 3.2786);
        bmi = weightInKilograms / Math.pow(heightInMeters, 2);
        //print the BMI to the User 
        System.out.format("BMI is %.3f\n", bmi);
        //print the BMI category that the user bmi fits under
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
        //close the scanner object when the program completes
        Scan.close();
	}
}
