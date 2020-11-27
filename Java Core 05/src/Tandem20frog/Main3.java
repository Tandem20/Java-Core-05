package Tandem20frog;



public class Main3 {
public static void main(String[] args) {
	Amphibia f = new Frog("комах", "6h", "12h", "6h", 3);

	System.out.println(f);
	f.eat();
	f.sleep();
	f.swim();
	f.walk();
}
}
