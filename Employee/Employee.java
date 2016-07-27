package Employee;

public class Employee {
	
	private int ID;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int iD, String firstName, String lastName, int salary) {
		super();
		ID = iD;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
	public int getAnnualSalary(){
		return salary*12;
	}
	public double raiseSalary(int salary){
		if(salary < 6000 && salary>8000){
			return salary * 1.15;
		}else if(salary>6000){
			return salary*1.5;
		}else{
			return salary;
		}
	}
	

}
