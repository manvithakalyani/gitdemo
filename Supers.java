class Animal {  
    String color = "white";  

    void printColor() {  
        System.out.println(color);        // prints black (Dog's color)
         // prints white (Animal's color)
    } 
}
class Dog extends Animal {  
    String color = "black";  // Dog class color

    void printColor() {  
        System.out.println(color);        // prints black (Dog's color)
         // prints white (Animal's color)
    } 
}
public class Supers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dg = new Dog();
		dg.printColor();
		

	}

}
