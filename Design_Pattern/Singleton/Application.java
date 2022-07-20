package Singleton;

public class Application {
	
	public static void main(String args[]) {
		
		 
		DBConnection dbConnection  = DBConnection.getDbConnection();
				System.out.println(dbConnection);
		
				DBConnection dbConnection1  = DBConnection.getDbConnection();
				System.out.println(dbConnection1);
		
}
}
