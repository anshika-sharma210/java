class CPU {
double price;
// nested class 
class processor {
// members of nested class
double cores;
String manufacturer;
double getCache(){
return 4.3;
}
}
// nested protected class
protected class RAM{
// members of protected nested class
double memory;
String manufacturer;
double getClockSpeed(){
return 5.5;
}
}
}
public class main {
public static void main(String[] args) {
// create object of outer class CPU
CPU cpu = new CPU();
//create an object of inner class processor using outer class
CPU.processor processor = cpu.new processor();
//create an object of inner class RAM using outer class CPU
CPU.RAM ram = cpu.new RAM();
System.out.println("Processor Cache = " +processor.getCache());
System.out.println("Ram Clock speed = " +ram.getClockSpeed());

}
}