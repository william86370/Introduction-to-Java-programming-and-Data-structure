import java.util.Scanner;
public class Question7_8Tester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double Array_To_Sort[] = new double[10];
		System.out.print("Enter 10 Numbers: ");
		for(int i=0;i<10;i++) {
			Array_To_Sort[i] = scanner.nextDouble();
		}
		System.out.println("");
		double Average_value = Average(Array_To_Sort);
		System.out.print("The Average Value is: ");
		System.out.print(Average_value);
		scanner.close();
	}
	
	public int Average(int array[]) {
		int total=0;
		for(int i=0;i<array.length;i++) {
			total = total+array[i];
		}
		return total/array.length;
	}
	public static double Average(double array[]) {
		double total=0;
		for(int i=0;i<array.length;i++) {
			total = total+array[i];
		}
		return total/array.length;
	}
	public static int GetSmallestIndex(double array[]) {
		int low_index = 0;
		double min_Value=array[0];
		for(int i=0;i<array.length;i++) {
			if(min_Value<array[i]){
				min_Value=array[i];
				low_index = i;
			}
		}
		return low_index;
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
