package FactoryMethod;

public class ParkPackage {
	
	public static void main(String[] args) {
				
		Package package2 = Factory.createPackage(PackageDetail.GOLD);
		package2.printPack();
		
		Package package3 = Factory.createPackage(PackageDetail.PLATINUM);
		package3.printPack();
	}

}
