//Created By Emma Seehousz on 4/16
import java.util.Scanner;
public class Question3_8{

	public static void main(String[] args) {
		//create new scanner object
		Scanner scanner = new Scanner(System.in);
		//prompt the user for 3 ints to sort
		System.out.print("Enter three integers for the program to sort in non-decreasing order: ");
		//get all 3 int values from user
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int lowest = 0;
        int middle = 0;
        int highest = 0;
        //sort thought the values and find results.
        if (a < b) {
            if (a < c) {
                lowest = a;
            } else {
                middle = a;
                lowest = c;
                highest = b;
            }
        } else if (a < c) {
            lowest = b;
            middle = a;
            highest = c;
        } else {
            if (c < b) {
                lowest = c;
                middle = b;
            } else {
                lowest = b;
                middle = c;
            }
            highest = a;
        }
        //print results to user
        System.out.println("The non-decreasing order is: " + lowest + " : " + middle + " : " + highest);
        scanner.close();
    }
}
