package Prototype;

public class Nuts extends Icecream {
	
	private String flavour;	
	
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	
	
	@Override
	public String toString() {
		return "Nuts {" + 
	"flavour=" + flavour + '}';
	}
	
	}
