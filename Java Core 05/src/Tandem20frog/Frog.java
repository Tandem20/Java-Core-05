package Tandem20frog;



public class Frog extends Amphibia {
private int age;

public Frog(String eat, String sleep, String swim, String walk, int age) {
	super(eat, sleep, swim, walk);
	this.age = age;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "Frog [age=" + age + "]";
}

@Override
void eat() {
	System.out.println("комах");
	
}

@Override
void sleep() {
System.out.println("12h");
	
}

@Override
void swim() {
	System.out.println("yes");
	
}

@Override
void walk() {
	System.out.println("no");
	
}





}
