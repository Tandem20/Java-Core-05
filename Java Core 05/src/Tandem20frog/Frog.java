package Tandem20frog;



public class Frog extends Amphibia {
private int age;
	
public Frog(String eat, String sleep, String swim, String walk, int age) {
	super(eat, sleep, swim, walk);
	this.age = age;
	

}

@Override
public String toString() {
	return "Frog [age=" + age + ", toString()=" + super.toString() + "]";
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

//@Override
//public String toString() {
//	return "Frog [age=" + age + "]";
//}

@Override
void eat() {
	System.out.println("Frog is eating");
	
}

@Override
void sleep() {
System.out.println("Frog is sleeping");
	
}

@Override
void swim() {
	System.out.println("Frog is swiming");
	
}

@Override
void walk() {
	System.out.println("Frog is walking");
	
}





}
