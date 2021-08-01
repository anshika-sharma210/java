//Polymorphism in java is the ability of an object to take many forms. to simply put, Polymorphism in java allows us to perform the same action in many different ways.
// there are two types of polymorphism in java . compile-time polymorphism and run-time polymorphism.
// Method overloading occurs when there is more than  one method of the same name in the class.
// method overriding is defined as a process when the subclass or a child class has the same method as a declared in the parent class.
// Compile time polymorphism in java Also known as Static Polymorohism.in this process the call the call to the method is resolved at compile -time . compile time polymorphism is achieved through method overloading
// Run time Polymorphism in java is also Known as Dynamic method dispatch. tn this process the call to an overridden method is resolved dynamically at runtime rather than at compile time.Runtime polymorphismis Achieved through Method Overriding.
package programs;

public class Polymorphism {
class Shapes {
	public void area() {
		System.out.println("The formula for area of ");
	}
}
class Tringle extends Shapes {
	public void area() {
		System.out.println("Tringle is 1/2 *base *height");
	}
}
class Circle extends Shapes {
	public void area() {
		System.out.println("Circle is *radius*radius");
	}
}
class main {
	public static void main (String[]args) {
		Shapes myShape = new Shapes (); //create a shape object.
		Shapes myTringle = new Tringle(); //create a Triangle object.
		Shapes myCircle = new Circle(); //create circle object.
	myShape.area();
	myTringle.area();
	myShape.area();
	myCircle.area();
	}
}
}

