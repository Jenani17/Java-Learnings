package Builder;

public class Application {

	public static void main(String args[] ) {
				
		Phone.Builder builder = new Phone.Builder("Smart phone");
		Phone phone1 = builder.brand("Samsung").build();
		Phone phone2 = builder.color("Blue").build();
			
		System.out.println(phone1);
		System.out.println(phone2);
			
		}

	}
