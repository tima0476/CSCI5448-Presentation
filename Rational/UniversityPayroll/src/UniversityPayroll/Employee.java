package UniversityPayroll;

import java.lang.Long;
import java.lang.String;
import UniversityPayroll.Paycheck;

public class Employee {

	protected Long EmployeeID;
	protected String Name;
	protected String Address;
	protected String Division;
	protected String GrossPay;
	protected String NetPay;
	protected String PaycheckType;
	protected String SupervisorID;
	protected Paycheck paycheck;
	public void LoadData() {
		// Load data from disk
	}
	public void GetNetPay() {
	
	}
	public String GetEmployeeNameAddr() {
		return null;
	}

}
