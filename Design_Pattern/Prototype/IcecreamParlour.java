package Prototype;

public class IcecreamParlour{
	
	public static void main(String args[]) {
		Registry registry = new Registry();
		
		Nuts nuts = (Nuts) registry.getIcecream(IcecreamType.NUTS);
		System.out.println(nuts);
		
		nuts.setFlavour(" Fruits");
		
		System.out.println(nuts);
		
		Nuts nuts1=(Nuts) registry.getIcecream(IcecreamType.NUTS);
		
		System.out.println(nuts1);	
		
	}
	
}
