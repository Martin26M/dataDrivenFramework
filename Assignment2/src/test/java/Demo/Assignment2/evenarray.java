package Demo.Assignment2;

public class evenarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr = {1,2,3,4,5,6,7};
		 int len = arr.length;
		
		 int []  arr1 = new int [arr.length];
		 int temp=0;
		 
		for (int i =0 ; i<arr.length; i++) {
			
			if (arr[i]%2==0) {
				
				arr1[temp]= arr[i];
				temp++;
			}
	}
			for (int j=temp; j<arr.length; j++) {
				
				
				arr1[temp]=arr[j];
				temp++;
			}
			
			
		}
	
}
