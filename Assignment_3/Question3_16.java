//Created By Emma Seehousz on 4/16
public class Question3_16
{
public static void main(String[] args)
{
	//declare var
	double x = Math.random() * 100 - 50;
	double y = Math.random() * 200 - 100;
	//calculate x and y cord using random numbers
  x = Math.random() * 50 * (Math.random() >= 0.5 ? 1 : -1);
  y = Math.random() * 100 * (Math.random() >= 0.5 ? 1 : -1);
	System.out.println("Coordinates of a random point inside a rectangle: " + x + ", " + y);

  }
}
