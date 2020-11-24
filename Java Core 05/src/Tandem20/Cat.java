package Tandem20;



public class Cat extends Pet {
private String name;
private int age;
public Cat(double weight, int height, String name, int age) {
	super(weight, height);
	this.name = name;
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Cat [name=" + name + ", age=" + age + "]";
}
@Override
void voice() {
	System.out.println("ί κ³ς-Μÿσσσ-Μÿσσσ");
	
}

	
	
}