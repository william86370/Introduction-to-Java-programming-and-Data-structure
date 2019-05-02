//Created By Emma Seehousz on 4/16
public class Question5_10
{
	public static void main(String[] args)
	{
		final int NUMBERS_PER_LINE = 10;
		/* just like last time, we'll check if count % NUMBERS_PER_LINE is equal to 0. If yes, we'll move 
		the cursor to the next line */

		int count = 0;
		for (int i = 100; i <= 1000; i++)
		{
			// check whether a number is divisible by both 5 and 6
			if (i % 5 == 0 && i % 6 == 0)
			{
				count++;
				System.out.print(i + " ");

				if (count % NUMBERS_PER_LINE == 0)
				{
					System.out.println();	// move the cursor to the next line
				}
			}
		}
	}
}