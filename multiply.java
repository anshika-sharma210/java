import java.util.Scanner;
class multiply
{
public static void main(String args[])
{
System.out.println("Enter two floating-point numbers");
Scanner scan = new Scanner(System.in);
float num1 = scan.nextFloat(), num2= scan.nextFloat();
float product = num1 * num2;
System.out.println("The product of "+num1+" and "+num2+" is = "+product);
}
}