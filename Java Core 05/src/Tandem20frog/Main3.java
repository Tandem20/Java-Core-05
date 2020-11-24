package Tandem20frog;



public class Main3 {
public static void main(String[] args) {
	Frog f = new Frog ("комарів", "12h", "yes", "no", 2);
	System.out.println(f);
	f.eat();
	f.sleep();
	f.swim();
	f.walk();
}
}
