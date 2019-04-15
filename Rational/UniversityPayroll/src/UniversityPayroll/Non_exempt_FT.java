package UniversityPayroll;

public class Non_exempt_FT extends Employee {

	private float HourlyRate;
	private float HoursWorked;
	private int EmployeeBenefits;
	
	public Non_exempt_FT() {
		// TODO Auto-generated constructor stub
	}

	public long GrossPay() {
		return 20000L;
	}
	
	public long NetPay() {
		return 18000L;
	}
	
	public void LoadData() {
		
	}


}
