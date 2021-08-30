import java.util.*;
public class ComputeQuotientandRemainder
{
public static void main(String [] args)
{
// Take dividend as divisor as variables dvnd and dvsr respectivly
int dvnd = 456, dvsr= 8;
//take quotient as variable quot and compute quotient
// store the result in rem
int quot = dvnd / dvsr;
// Take remainder as variable rem and compute remainder
// Store the result in rem
int rem = dvnd % dvsr;
// Print the quotient value 
System.out.println("Quotient = " +quot);
//print the remainder value 
System.out.println("Remainder = "+ rem);
}
}