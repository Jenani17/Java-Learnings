package ChainOfResponsibility;

public class HR extends Handler {

	@Override
	public String applyLeave(Leave leave) {
		
		if(leave.getDays() <= 21 ) {
			
			if (leave.getTier() <= 1) {
				return "APPROVED By HR";
			}
			else {
				return "Leave DENIED By HR ";
			}
			
		}
		
		else {
			return successor.applyLeave(leave);
		}
		

	}
}
