package Tandem20;



public class Main {
public static void main(String[] args) {
	Cow c = new Cow(300, 150, "New", 5);
	System.out.println(c);
	c.voice();
	System.out.println();
	Cat k = new Cat(3, 40, "Cat", 5);
	System.out.println(k);
	k.voice();
	Dog d = new Dog(15, 80, "Dog");
	System.out.println(d);
	d.voice();
}
}