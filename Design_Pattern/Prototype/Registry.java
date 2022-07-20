package Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	
	private Map<IcecreamType, Icecream> icecreams = new HashMap<IcecreamType, Icecream>();
	
	public Registry() {
		this.initialize();
		
	}
	
	public Icecream getIcecream(IcecreamType icecreamType) {
		Icecream icecream= null;
		try {
			 
			icecream =(Icecream) icecreams.get(icecreamType).clone();
			
		}		catch(CloneNotSupportedException e) {
			e.printStackTrace();
			}
		return icecream;
	}
	
private void initialize(){
		Nuts nuts = new Nuts();
		nuts.setName("Double Nuts");		
		nuts.setIncredient("chocolate icecream, cashew, peanuts");
		nuts.setFlavour("Chocolate");
		
		Special special = new Special();
		special.setName("Rio Special");		
		special.setIncredient("vanilla icecream, chocolate icecream,fruits, jelly");
		special.setType("Fruit and Nuts special");
		
		Mega mega = new Mega();
		mega.setName("Mega Special");		
		mega.setIncredient("vanilla icecream, chocolate icecream,fruits, jelly, nuts, fruiticecream");
		mega.setPack("Family pack");		
		
		
		icecreams.put(IcecreamType.SPECIAL, special);
		icecreams.put(IcecreamType.NUTS, nuts);
		icecreams.put(IcecreamType.MEGA, mega);
		
	}

}
