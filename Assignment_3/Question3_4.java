//Created By Emma Seehousz on 4/16
public class Question3_4 {
	public static void main(String[] args) {
		//create the new random int from 1-12
		int randomMonth = (int) (Math.random() * 13);
		//print out to the user the random number we created
        System.out.print("Random number: [" + randomMonth + "] which is Month ");
        //call a switch case to loop through the different months.
        switch (randomMonth) {
            case 1:
                System.out.print("January");
                break;
            case 2:
                System.out.print("February");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("June");
                break;
            case 7:
                System.out.print("July");
                break;
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("September");
                break;
            case 10:
                System.out.print("October");
                break;
            case 11:
                System.out.print("November");
                break;
            case 12:
                System.out.print("December");
        }
	}
}
