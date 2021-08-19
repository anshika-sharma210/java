class Fruit {
    String name;
    
    Fruit() {
        name = "Fruit";
    }
    
    public String getName() {
        return name;
    }
}

class Banana extends Fruit {
    Banana() {
        name = "Banana";
    }
}



public class Application {


    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Banana banana = new Banana();
        
        System.out.println(fruit.getName());
        System.out.println(banana.getName());
    }

}