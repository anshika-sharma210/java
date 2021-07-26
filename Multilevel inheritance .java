// Multiple inheritance are available in object-oriented programming with C++, but it is not available in java.
//java developers want to use multiple inheritance in some cases. Fortunately java developers  have interface concepts expecting  to developers to achieve multiple interface.
// Multi-level Inheritance in java ,a class extends from another class .
//For Example , if there is a class A that extends from class B and classB extends from another class C, then this scenario is known as multi-level inheritance.
package programs;

public class MultilevelInheritance {
class Car{
	public Car() {
		System.out.println("Class Car");
		}
	public void vehicleType()
	{
	System.out.println("vehicleType: Car");
	}
}
class Maruti extends car{
	public Maruti()
	{
		System.out.println("class Maruti");
		
		}
	public void brand() {
		System.out.println("Brand: Maruti");
	}
	public void speed() {
		System.out.println("Brand: Maruti");
	}
	public class Maruti800 extends Maruti {
		public Maruti800()
		{
			System.out.println("Maruti Model:800");
		}
		public void sped() {
			System.out.println("Max: 80Kmph");
		}
		public static void main(String[] args) {
			Maruti800 obj=new Maruti800();
			obj.VehicleType();
			obj.brand();
			obj.speed();
			}
	}
}
}

