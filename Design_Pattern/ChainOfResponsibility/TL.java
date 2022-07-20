package ChainOfResponsibility;
public class TL  extends Handler{

	@Override
	public String applyLeave(Leave leave) {
		
		if(leave.getDays() <= 4) {
			
			if (leave.getTier() <= 4) {
				return "Leave APPROVED By TeamLead";
			}
			else {
				
				if(leave.getDays() <= 2) {
					return "Leave APPROVED By TeamLead";
				}
				else {
				return "Leave DENIED By TeamLead ";
			   }
			}
			
		}
		
		else {
			return successor.applyLeave(leave);
		}
		

	}
	
	
}
