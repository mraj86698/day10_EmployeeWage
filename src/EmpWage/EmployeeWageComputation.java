package EmpWage;

import java.util.Scanner;

public class EmployeeWageComputation {

	public static void main(String[] args) {


		System.out.println("Welcome to Employee Wage Problem ");
		System.out.println();
		System.out.println("Shopclues Employee Data ");
		EmpCompute shopclues = new EmpCompute();
		shopclues.Emp(20, 8, 4, 20, 100);

		System.out.println("\n Flipkart Employee Data ");
		EmpCompute flipkart = new EmpCompute();
		flipkart.Emp(25, 10, 5, 28, 140);

		System.out.println("\n Amazon Employee Data ");
		EmpCompute amazon = new EmpCompute();
		amazon.Emp(28, 12, 6, 25, 180);

		EmpCompute emp = new EmpCompute();
		Scanner sc = new Scanner(System.in);



	}

}
