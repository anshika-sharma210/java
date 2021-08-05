// Hybrid inheritance is a combination of more than one types of inheritance .for Ex- when class A and class B extends class C &another class D extends class A then this is a hybrid inheritance , because it is a combination of single and hierarchial inheritance .
package programs;

public class HybridInheritance {
 class C 
 {
	 public void disp() {
		System.out.println("C") ;
	 }
 }
 class A extends C
 {
	 public void disp()
	 {
		 System.out.println("A");
	 }
 }
 class B extends C
 {
	 public void diso()
	 {
		 System.out.println("B");
	 }
 }
 class D extends A
 { 
	 public void disp()
	 {
	 System.out.println("D");	 
 }
 
	public static void main(String[] args) {
	D obj = new D()	;
	obj.disp();
	}
	}

}
