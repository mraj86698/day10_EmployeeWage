package EmpWage;

public class EmployeeWageComputation {

	public static void main(String[] args) {

		//creating objects and passing values
		EmpCompute google = new EmpCompute("Google", 8, 20, 100);
        EmpCompute microsoft = new EmpCompute("Microsoft", 4, 30, 150);
        //calling method to display the values of object
        google.calculateTotalWage();
        System.out.println(google);

        microsoft.calculateTotalWage();
        System.out.println(microsoft);

	}

}
