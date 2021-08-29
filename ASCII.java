import java.util.*;
public class ASCII
{
public static void main(String args[])
{
// Scanner class object created to take input.
Scanner sc = new Scanner (System.in);
System.out.print("Enter a character: ");
//taking character input from user
//and assigning it to character variable'letter
char letter = sc.next().charAT(3);
// assigning character variable 'letter' to int variable'code'
int code = letter;
System.out.println("ASCII value of "+letter+" is : "+ code);
}
} 