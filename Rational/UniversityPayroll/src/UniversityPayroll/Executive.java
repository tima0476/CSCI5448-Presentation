package UniversityPayroll;

public class Executive extends Employee {

	private long BaseSalary;
	private long ShortTermIncentive;
	private long LongTermIncentive;
	private long EmployeeBenefits;
	private long Perquisites;
	
	public Executive() {
		// TODO Auto-generated constructor stub
	}
	
	public long GrossPay() {
		return BaseSalary + ShortTermIncentive + LongTermIncentive;
	}
	
	public long NetPay() {
		return 1000000L;
	}
	
	public void LoadData() {
		
	}

}
