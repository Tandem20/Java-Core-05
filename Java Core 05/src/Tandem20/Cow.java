package Tandem20;




	public class Cow extends Pet {
		private String breed;
		private int maxSpeed;
		public Cow(double weight, int height, String breed, int maxSpeed) {
			super(weight, height);
			this.breed = breed;
			this.maxSpeed = maxSpeed;
		}
		public String getBreed() {
			return breed;
		}
		public void setBreed(String breed) {
			this.breed = breed;
		}
		public int getMaxSpeed() {
			return maxSpeed;
		}
		public void setMaxSpeed(int maxSpeed) {
			this.maxSpeed = maxSpeed;
		}
		@Override
		public String toString() {
			return "Cow [breed=" + breed + ", maxSpeed=" + maxSpeed + "]";
		}
		@Override
		void voice() {
			System.out.println("ß êîğîâà-Ìóóó-Ìóóó");
			
		}
		
	}

