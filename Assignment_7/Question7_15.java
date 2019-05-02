import java.util.Scanner;
public class Question7_15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Array_To_Sort[] = new int[10];
		System.out.print("Enter 10 Numbers: ");
		for(int i=0;i<10;i++) {
			Array_To_Sort[i] = scanner.nextInt();
		}
		System.out.println("");
		int[] New_Array = eliminateDuplicates(Array_To_Sort);
		System.out.print("The distinct numbers are: ");
		for(int i=0;i<New_Array.length;i++) {
			System.out.print(New_Array[i]);
			System.out.print(" ");
		}
		scanner.close();
	}
	public static int[] eliminateDuplicates(int[] list) {
		int[] dup = new int[10];
		int j = 0;
		for (int i = 0; i < list.length; i++){
		dup [i] = 0;
		}
		int count = 0;
		for(int i = 0; i < list.length; i++)
		{
		boolean duplicate = false;
		for(j = 0; j < count; j++)
		if(list[i] == dup[j])
		{
		duplicate = true;
		break;
		}
		if(!duplicate)
		{
		dup[count] = list[i];
		count++;
		}
		}
		int [] newArray = new int[count];
		for(int i = 0; i < count; i++)
		newArray[i] = dup[i];
		return newArray;
		}
		
	
}
