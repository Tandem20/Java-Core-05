package Tandem20masha;

public abstract class Masha {
	private double weight;

	public Masha(double weight) {
		super();
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	abstract void height();

	@Override
	public String toString() {
		return "Masha [weight=" + weight + "]";
	}
	
	
	
	
	

}
