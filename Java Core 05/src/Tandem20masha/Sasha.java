package Tandem20masha;



public class Sasha extends Masha {
private String name;

public Sasha(double weight, String name) {
	super(weight);
	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Sasha [name=" + name + "]";
}

@Override
void height() {
	System.out.println("this 190");
	
}



}
