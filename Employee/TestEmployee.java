package Employee;

public class TestEmployee {
	
	public static void main(String[] args) {
		Employee employee = new Employee(1, "bel", "dek", 7000);
		System.out.println(employee);
		System.out.println("Get per year "+employee.getAnnualSalary());
		System.out.print("And will be raise salary after year per month to : ");
		System.out.print(employee.raiseSalary(7000));
		System.out.print(" and in the next year will get: ");
		System.out.print(employee.raiseSalary(7000)+employee.getAnnualSalary());

	}

}
