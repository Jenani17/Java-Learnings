package ChainOfResponsibility;

public class Leave {
	 private String leavetype;
	 private int days;
	 private int tier;
	 private String  reason;
	 
	 public Leave(String leavetype, int days, int tier, String reason) {
		 this.leavetype = leavetype;
		 this.days= days;
		 this.tier=tier;
		 this.reason =reason;
	 }


	public String getLeavetype() {
		return leavetype;
	}

	public int getDays() {
		return days;
	}


	public int getTier() {
		return tier;
	}

	public String getReason() {
		return reason;
	}

	  
	}
