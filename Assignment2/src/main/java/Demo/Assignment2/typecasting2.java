package Demo.Assignment2;

public class typecasting2 extends typecasting{

	
	String name;
	int no;
	
 public void checktypeparent() {
		
		System.out.println("in Child");
		
	}
	
	public void checkchild2() {
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		typecasting t = new typecasting();
	
		t.checktypeparent();
		

		
		typecasting k = new typecasting2();
		
		typecasting2 cc = (typecasting2)k;
		cc.checktypeparent();
		
		t.name="Martin";
		
		typecasting2 child = new typecasting2();
		
		
		
		
		child.name="Child Name";
		child.no=100;
		
		
		
	}

}
