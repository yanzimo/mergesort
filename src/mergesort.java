import java.io.*;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;


public class mergesort {
	
	public static void main(String[] args) throws IOException{
		
		// just read the input files, those file names are manually changed when testing
		BufferedReader a = new BufferedReader(new FileReader("files/10000R.txt"));
		// to record the start time of the program
		long startTime = System.nanoTime();
		System.out.println("Start Time" +startTime);
		// to put input files into array
		int arraySize = Integer.parseInt(a.readLine());
		int[] inputArray = new int[arraySize];
		for (int i= 0; i < arraySize; i++){
			inputArray[i]= Integer.parseInt(a.readLine());
		}
		// to do the merge sort
			mergeS(inputArray);
			printArray(inputArray);
			
			// to record the end time
		long endTime = System.nanoTime();
		System.out.println("End Time" +endTime);
		long estimatedTime = endTime-startTime;
		System.out.println("Estimated Time" +estimatedTime);
		
		}
		//merger sort method
		 static void mergeS(int[] A){
			 if (A.length <=1)
				 return;
			 // break the array into 2 parts: left and right
				 int q = A.length/2;
				 
				 int[] l = Arrays.copyOfRange(A, 0, q);
				 int[] r = Arrays.copyOfRange(A, q, A.length);
				 
				 mergeS(l);
				 mergeS(r);
				 // start iterating left and right parts
			 int i;
			 int left;
			 int right;
			 
			 i = left = right = 0;
			 
			// all four scenarios
				while ((left< l.length) &&(right< r.length)){
					if (l[left]< r[right]){
						A[i++]= l[left++];
					
						
					} else {
						A[i++]= r[right++];
						
						
					}
				} 
				while (left < l.length){
					A[i++]= l[left++];
				}
				while (right < r.length){
					A[i++]= r[right++];
				}
		     }
	    // print the array , just to see if the file is read right
		public static void printArray(int[] arr) {
					for (int j = 0; j < arr.length - 1; j++) {
						System.out.print(arr[j] + ", ");
					}
					System.out.println(arr[arr.length - 1]);
				}
	     
   }
		
		 

