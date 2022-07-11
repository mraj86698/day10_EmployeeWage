package EmpWage;

import java.util.ArrayList;
import java.util.HashMap;

interface IEmpCompute {
	public void addCompany(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours);
	public void calculateTotalWage();
	public int getTotalEmpWage(String companyName);
}

public class EmpCompute implements IEmpCompute {

	// class constants
	static final int partTime = 1;
	static final int fullTime = 2;
	// instanceConstants
	String companyName;
	int wagePerHour;
	int maxWorkingDays;
	int maxWorkingHours;
	// instance Variable
	int totalEmpWage = 0;
	int noOfCompanies, index;
	//references of companyempwage objects are stored in arraylist
	ArrayList<EmpCompute> companies;
	//companyname is mapped with total employee wage
	HashMap<String,Integer> totalEmpWages;

	// creating a parameterized constructor

	public EmpCompute(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.maxWorkingDays = maxWorkingDays;
		this.maxWorkingHours = maxWorkingHours;

	}

	//defalut constructor

	public EmpCompute() {
		companies = new ArrayList<>();
		totalEmpWages=new HashMap<>();

	}

	void setTotalEmployeeWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	 //it creates Company EmployeeWage objects and add to the arraylist
	@Override
	public void addCompany(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {

		EmpCompute company = new EmpCompute(companyName, wagePerHour, maxWorkingDays, maxWorkingHours);
		companies.add(company);
		totalEmpWages.put(companyName,0);
	}

	int generateEmployeeType() {
		return (int) (Math.random() * 100) % 3;
	}

	int getWorkingHours(int empType) {
		switch (empType) {
		case fullTime:
			return 8;
		case partTime:
			return 4;
		default:
			return 0;
		}
	}

	@Override
	public void calculateTotalWage() {
		for (EmpCompute company : companies) {
			int totalWage = calculateTotalWage(company);
			company.setTotalEmployeeWage(totalWage);
			System.out.println(company);
		}
	}

	int calculateTotalWage(EmpCompute empCompute) {
		System.out.println("Computation of total wage of " + empCompute.companyName + "Employee");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.printf("%5s		%5s		%5s		%5s\n", "Day", "WorkingHours", "Wage", "TotalWorkingHours");
		int workingHours, totalWage = 0;
		for (int day = 1, totalWorkingHours = 0; day <= empCompute.maxWorkingDays
				&& totalWorkingHours <= empCompute.maxWorkingHours; day++, totalWorkingHours += workingHours) {
			int EmpType = generateEmployeeType();
			workingHours = getWorkingHours(EmpType);
			int wage = workingHours * empCompute.wagePerHour;
			totalWage += wage;
			System.out.printf("%10d       %10d      %10d      %10d\n", day, workingHours, wage,totalWorkingHours + workingHours);
		}
		totalEmpWages.put(empCompute.companyName, totalWage);
		return totalWage;
	}
	 void printTotalEmpWages()
	    {
	        System.out.println("The Companies and their total Employee Wages are:");
	        for (String companyName : totalEmpWages.keySet())
	        {
	            System.out.println(companyName + ": " + totalEmpWages.get(companyName));
	        }

	    }

	 @Override
	public int getTotalEmpWage(String companyName)
	    {
	        return totalEmpWages.get(companyName);
	    }


	@Override
	public String toString() {
		System.out.println("Details of " + companyName + " employee");
		System.out.println("--------------------------------------------------------------------------------");
		System.err.println("Wage per hour:" + wagePerHour);
		System.out.println("Maximum working days:" + maxWorkingDays);
		System.out.println("Maximum working hours:" + maxWorkingHours);
		return "Total wage for a month of " + companyName + " employee is " + totalEmpWage + "\n";
	}

}
