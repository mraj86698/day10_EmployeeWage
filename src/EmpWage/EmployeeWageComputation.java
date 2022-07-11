package EmpWage;

public class EmployeeWageComputation {

	public static void main(String[] args) {

		EmpCompute empCompute=new EmpCompute();
		empCompute.addCompany("Microsoft", 4, 30, 100);
        empCompute.addCompany("Google", 5, 40, 170);
        empCompute.addCompany("Apple", 9, 10, 70);
        empCompute.addCompany("Amazon", 19, 10, 150);
        empCompute.calculateTotalWage();
        empCompute.printTotalEmpWages();
        String query = "Google";
        int totalWage = empCompute.getTotalEmpWage(query);
        System.out.println("Total Employee Wage for " + query + " company is " + totalWage);


	}

}
