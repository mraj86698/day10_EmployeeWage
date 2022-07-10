package EmpWage;

public class EmpCompute {

	// class constants
	static final int partTime = 1;
	static final int fullTime = 2;
	// instanceConstants
	String companyName;
	int wagePerHour;
	int maxWorkingDays;
	int maxWorkingHours;
	// instance Variable
	int totalWage=0 ;

	//creating a parameterized constructor

	public EmpCompute(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.maxWorkingDays = maxWorkingDays;
		this.maxWorkingHours = maxWorkingHours;

	}

	int generateEmployeeType() {
		return (int) (Math.random() * 100) % 3;
	}

	int getWorkingHours(int empType) {
		switch (empType)
		{
		case fullTime:
			return 8;
		case partTime:
			return 4;
		default:
			return 0;
		}
	}

	public void calculateTotalWage() {
		System.out.println("Computation of total wage of "+companyName+"Employee");
		System.out.println("-----------------------------------------------------");
		System.out.printf("%5s		%5s		%5s		%5s\n","Day","WorkingHours","Wage","TotalWorkingHours");
		int workingHours;
		for(int day=1,totalWorkingHours=0;day <= maxWorkingDays && totalWorkingHours <= maxWorkingHours;day++,totalWorkingHours += workingHours) {
			int EmpType=generateEmployeeType();
			workingHours=getWorkingHours(EmpType);
			int wage=workingHours*wagePerHour;
			totalWage+=wage;
			System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHours, wage, totalWorkingHours + workingHours);
		}
	}
	@Override
	public String toString() {
		System.out.println("Details of " + companyName + " employee");
		System.out.println("-----------------------------------------------------");

		System.out.println("Maximum working days:" + maxWorkingDays);
		System.out.println("Maximum working hours:" + maxWorkingHours);
		return "Total wage for a month of " + companyName + " employee is " + totalWage + "\n";
	}

}
