package ChainOfResponsibility;

public class Manager extends Handler {

	@Override
	public String applyLeave(Leave leave) {
		
		if(leave.getDays() <= 14 ) {
			
			if (leave.getTier() <= 2) {
				return "Leave APPROVED By Manager";
			}
			else {
				return "Leave DENIED By Manager ";
			}
			
		}
		
		else {
			return successor.applyLeave(leave);
		}
		

	}
	
}
