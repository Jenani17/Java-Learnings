package Prototype;

public abstract class Icecream implements Cloneable {
	
	private String name;
	private String incredient;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getIncredient() {
		return incredient;
	}

	public void setIncredient(String incredient) {
		this.incredient = incredient;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
