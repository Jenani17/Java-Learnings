package ChainOfResponsibility;
public class Main {

	public static void main(String args[]) {
		TL teamlead = new TL();
		PL projectlead = new PL();
		Manager reportingmanager = new Manager();
		HR hr = new HR();
		
		teamlead.setSuccessor(projectlead);
		projectlead.setSuccessor(reportingmanager);
		reportingmanager.setSuccessor(hr);
		
		
		Leave leave1 = new Leave ("HalfDay", 1, 4, "Sick");
		System.out.println(teamlead.applyLeave(leave1));
		
		Leave leave2 = new Leave ("Fulltime", 9 , 3, "Casual");
		System.out.println(teamlead.applyLeave(leave2));
		
		
		Leave leave3 = new Leave ("Fulltime", 12, 2, "No pay");
		System.out.println(teamlead.applyLeave(leave3));
		
		
		Leave leave4 = new Leave ("Fulltime", 18, 2, "Casual");
		System.out.println(teamlead.applyLeave(leave4));
		
		
		Leave leave5 = new Leave ("Fulltime", 3, 5, "Sick");
		System.out.println(teamlead.applyLeave(leave5));
		
		Leave leave6 = new Leave ("Fulltime", 2, 5, "Sick");
		System.out.println(teamlead.applyLeave(leave6));
		
	}
	
}
