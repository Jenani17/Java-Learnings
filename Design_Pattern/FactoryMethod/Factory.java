package FactoryMethod;

public class Factory {
	
public static Package createPackage(PackageDetail packageDetail) {
	
	switch (packageDetail) {
	
	case SILVER:
		return new Silver();
	case GOLD:
		return new Gold();
	case PLATINUM:
		return new Platinum();
		
		default:
			return null;
	}
}
}
