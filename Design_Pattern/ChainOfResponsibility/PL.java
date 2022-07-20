package ChainOfResponsibility;

public class PL extends Handler {

	@Override
	public String applyLeave(Leave leave) {
		
		if(leave.getDays() <= 8) {
			
			if (leave.getTier() <= 3) {
				return "Leave APPROVED By Project Lead";
			}
			else {
				return "Leave DENIED By  Project Lead ";
			}
			
		}
		
		else {
			return successor.applyLeave(leave);
		}
		

	}

}
