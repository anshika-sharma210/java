package programs;

 
public class WithoutThis {
 class Demo
{
  
int x = 10;			// NSDM
  void show (Demo d1) 
  {
    
int x = 20;		// Local
    System.out.println (d1.x);
    
System.out.println (x);

} 

}
public static void main (String[]args)
{
    
CharDemo d = new CharDemo () ;
 d.show (d);
}

} 

