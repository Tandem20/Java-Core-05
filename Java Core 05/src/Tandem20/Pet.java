package Tandem20;

public abstract class Pet {
	private double weight;
	private int height;
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Pet(double weight, int height) {
		super();
		this.weight = weight;
		this.height = height;
	}
	abstract void voice();
	@Override
	public String toString() {
		return "Pet [weight=" + weight + ", height=" + height + "]";
	}
	
	
	
	

}

