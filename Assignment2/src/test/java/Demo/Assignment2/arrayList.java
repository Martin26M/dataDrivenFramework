package Demo.Assignment2;

import java.util.ArrayList;

public class arrayList {
	
	public static ArrayList<Object[][]> checkdata() {
		
		
	ArrayList<Object[][]> objectData = new ArrayList<Object[][]>();
		
		String[][] data = new String[1][2];
		
		data[0][0]="car";
		
		data[0][1]="body";
		
		
		objectData.add(data);
		
		return objectData;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object[][]> data =		checkdata();
	
		for (Object[][] data1: data) {
			
			System.out.println(data1[0][0]);
			System.out.println(data1[0][1]);
			
		}
		
		

	}

}
