package Builder;

public class Phone {
	private final String model;
	private final String brand;
	private final String color;
	
	public Phone(Builder builder){
		this.model =builder.model;
		this.brand =builder.brand;
		this.color =builder.color;
			}
			
	static class Builder{
		private String model;
		private String brand;
		private String color;		
		
		public Builder(String model) {
			this.model =model;
		}

		public Phone build() {
			return new Phone(this);
		}
					
		public Builder brand(String brand) {
			this.brand = brand;
			return this;			
		}
		
		public Builder color(String color) {
			this.color = color;
			return this;
			
		}
		
	}


	@Override
	public String toString() {
		return " model=" + model + "\n brand=" + brand + "\n color=" + color;
	}
	
	

}
