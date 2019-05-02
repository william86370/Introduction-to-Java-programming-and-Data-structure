import java.util.Scanner;
public class Question7_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double Array_To_Sort[] = new double[10];
		System.out.print("Enter 10 Numbers: ");
		for(int i=0;i<10;i++) {
			Array_To_Sort[i] = scanner.nextDouble();
		}
		System.out.println("");
		double smallest_index_Value = GetSmallestIndex(Array_To_Sort);
		System.out.print("The Index Of The Smallest Element Is: ");
		System.out.print(smallest_index_Value);
		scanner.close();
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
}
