// Hierarchial inheritance: In such kind of  inheritance one class is inherited by many sub class .Example class B,C and D inherits the same class A . A is a parent class(base class)of B,C,&d.
package programs;

public class HieararchialInheritance {
class A
{
	public void methodA()
	{
		System.out.println("method of class A");
	}
	}
class B extends A
{
	public void methodB()
	{
		System.out.println("method of class B");
		
	}
	class C extends B
	{
		public void methodC()
		{
			System.out.println("method of class C");
		}
		class D extends C
		{
			public void methodD ()
			{
				System.out.println("method of class D");
			}
		}
			class JavaExample
			{
				public static void main(String args[]) {
				B obj1 = new B();
				C obj2 = new C();
				D obj3 = new D();
				//All classes can access the method of class A
				obj1.methodA();
				obj2.methodA();
				obj3.methodA();
				}
			}
		
	}
}
}
