package Demo.Assignment2;

import java.util.Arrays;

public class removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,2,3,2,5,6,4,6,8,5};
		
		Arrays.sort(arr);
		
		int len = arr.length-1;
		
		int[]  arr1 =  new int[len];
		
		int temp=0;
		
		for (int i=0; i<arr.length-1; i++) 
		{
			if (arr[i]!=arr[i+1]) {
				
				
				arr1[temp] = arr[i];
				temp++;
				
			}
			
			
			
		}
		
		arr1[temp]= arr[len];


	
	for (Integer res: arr1) {
		
		System.out.println(res);
		
	}

}}
