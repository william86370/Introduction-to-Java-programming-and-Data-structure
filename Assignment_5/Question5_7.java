//Created By Emma Seehousz on 4/16
public class Question5_7
{
	public static void main(String[] args)
	{
		//declare varibles 
		double currentTuition = 10000;
		double rateOfIncrement = 0.05;
		int numberOfYears = 10;
		double totalTuitionFee = 0;
		//calculate final value
		double tuitionAfterTenYears = currentTuition * Math.pow((1 + rateOfIncrement), numberOfYears);
		System.out.printf("Tuition after ten years: %.2f\n", tuitionAfterTenYears);
		//loop to find value for 10 years
		for (int i = 1; i <= 4; i++)
		{
			totalTuitionFee += tuitionAfterTenYears;
			tuitionAfterTenYears *= (1 + rateOfIncrement);
		}
		//get final value and display to user
		System.out.printf("Total 4-year tuition fee, counted after the ten years: %.2f\n", totalTuitionFee);
	}
}