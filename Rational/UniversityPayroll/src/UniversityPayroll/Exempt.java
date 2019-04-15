package UniversityPayroll;

public class Exempt extends Employee {

	private int MonthlySalary;
	private int EmployeeBenefits;

	public Exempt() {
		// TODO Auto-generated constructor stub
	}
	
	public long GrossPay() {
		return MonthlySalary*12;
	}
	
	public long NetPay() {
		return 80000;
	}
	
	public void LoadData() {
		
	}


}
