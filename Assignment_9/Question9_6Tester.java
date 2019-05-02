//Created By Emma Seehousz on 4/16
public class Question9_6Tester {

	public static void main(String[] args) {
		//Declare out object type called stopwatch 
		Question9_6Class stopWatch = new Question9_6Class();
        //create 
        int[] arr = new int[100000];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
        }
        //start the timer
        stopWatch.startTime();
        //sort through the entire array
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
            
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        //stop the timer
        stopWatch.stopTime();
        //print the total time it took to sort to the user
        System.out.println("The sort took " + stopWatch.getElapsedTime() / 1000 + " seconds.");
	}
}
