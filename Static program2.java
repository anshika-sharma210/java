package newprogram;

public class A {
 static int x;
 A(){
	 x++;
	 System.out.println(x);
	  }
	public static void main(String[] args) {
		{
			new A();
			new A();
			new A();
		}	
			
	}
	

}
