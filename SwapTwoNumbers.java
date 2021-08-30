public class SwapTwoNumbers
{
public static void main(String[] args)
{
int a =  58, b = 45;
// print the value of numbers before swapping
System.out.println("--Before swapping--");
System.out.println("First number = " + a);
System.out.println("Second number = "+b);
// Assign value of a temporary (third)variable
int temp =a;
//value of b will be stored in a
a = b;
// value of temp (temporary variable )initially contains a' value
//a's value assigned to b.
b = temp;
// print the value of numbers after swapping
System.out.println("\n\n--After swapping--");
System.out.println("First number = " + a);
System.out.println("Second number = "+b);
}
}