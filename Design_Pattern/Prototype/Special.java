package Prototype;

public class Special extends Icecream {
	
private String type;	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	@Override
	public String toString() {
		return "Special {" + 
	"type=" + type + '}';
	}
	
	
}
