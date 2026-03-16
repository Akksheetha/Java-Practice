package Practice_Java;

public class ThisUsage {

		// TODO Auto-generated method stub
		int empid;
		String empName;
		double empSalary;
		ThisUsage(int empid, String empName, double empSalary){
			this.empid = empid;
			this.empName = empName;
			this.empSalary = empSalary;
			System.out.println("Employee record created successfully");
		}
		ThisUsage(){
			this(101,"Default Employee",30000);
			System.out.println("Default Constructor called");
		}
		void registerEmployee() {
			System.out.println("Registering Employee..");
			this.displayDetails();
		}
		void displayDetails() {
			System.out.println("Employee ID : "+empid);
			System.out.println("Employee Name : "+empName);
			System.out.println("Employee Salary : "+empSalary);
		}
		void sendForProcessing() {
			HRDepartment hr = new HRDepartment();
			hr.processEmployee(this);
		}
		ThisUsage updateSalary(double hike) {
			this.empSalary = empSalary+ (empSalary*hike/100);
			return this;
		}
		ThisUsage updateName(String newName) {
			this.empName = newName;
			return this;
		}
		public static void main(String[] args) {
		    ThisUsage emp = new ThisUsage(102, "Ram", 40000);
		    emp.registerEmployee();
		    emp.updateSalary(10).updateName("Ramesh").registerEmployee();
		    emp.sendForProcessing();
		}
}
class HRDepartment{
	void processEmployee(ThisUsage e) {
		System.out.println("HR Department Processing Employee");
		System.out.println("Processed Employee : "+e.empName+" with salary "+e.empSalary);
	}
	
}