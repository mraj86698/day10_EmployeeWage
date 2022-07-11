package EmpWage;

public class EmployeeWageComputation {

	public static void main(String[] args) {

		EmpCompute empCompute=new EmpCompute(3);
		empCompute.addCompany("Microsoft", 4, 30, 100);
        empCompute.addCompany("Google", 5, 40, 170);
        empCompute.addCompany("Apple", 9, 10, 70);
        empCompute.calculateTotalWage();


	}

}
