package Tandem20;



public class Dog extends Pet {

	private String name;

	public Dog(double weight, int height, String name) {
		super(weight, height);
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
		return "Dog [name=" + name + "]";
	}

	@Override
	void voice() {
		System.out.println("ί οερ-Γΰσσσ-Γΰσσσ");
		
	}

}
