class Person 
{
public void speak()
{
System.out.println("Person speaks");
}
}
class Teacher extends Person 
{
public static void speaks()
{
System.out.println("Teacher speaks");
}
}

public class StaticBinding
{
public static void main(String args[])
{
//Reference is of Person type and object
Person obj = new Teacher();
obj.speak();
//Reference and object both are of Person
Person obj2 = new Person();
obj2.speak();
}
}