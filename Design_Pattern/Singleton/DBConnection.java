package Singleton;

public class DBConnection {
	
	private static volatile DBConnection dbConnection;
	
	private DBConnection() {
		if(dbConnection != null) {
			throw new RuntimeException("Please use getDBConeection method!");
		
	}

}

	
public static DBConnection getDbConnection() {
	if(dbConnection == null) {
		synchronized (DBConnection.class) {
			if(dbConnection == null ) {
			dbConnection = new DBConnection();
			
		}
	}
	}	

return dbConnection;

}
}
