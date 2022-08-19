package Demo.Assignment2;

public class numberarrangment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		     [] arr1 = {1,2,3,4,5,6,7};
		
		int[] arr2 = new int [arr1.length];
		int temp=0;
		
		for (int i =0 ; i<arr1.length-1 ; i++) {
			
			
			while (i<arr1.length-1) {
				
				
				arr2[temp]= arr1[i];
				i++;
			}
			
					
		
			 temp++;
			
		}

		for (Integer val: arr2) {
			
			System.out.println(val);
		}
		
		
	}

}
