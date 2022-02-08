package assignment1.iitr.greatlearning;

public class SuperDepartment {
	public void departmentName() {
		System.out.println("Super Department");
	}
	public void getTodaysWork() {
		System.out.println("No work as of now");
	}
	public void getWorkDeadline() {
		System.out.println("Nil");
	}
	public void isTodayAHoliday() {
		System.out.println("Today is not a holiday");
	}
}

class AdminDepartment extends SuperDepartment{
	public void departmentName() {
		System.out.println("Welcome to Admin Department");
	}
	public void getTodaysWork() {
		System.out.println("Complete your document submission");
	}
	public void getWorkDeadline() {
		System.out.println("Complete by EOD");
	}
}

class HRDepartment extends SuperDepartment{
	public void departmentName() {
		System.out.println("\n\nWelcome to HR Deprtment");
	}
	public void getTodaysWork() {
		System.out.println("Fill today's timesheet and mark your attendance");
	}
	public void getWorkDeadline() {
		System.out.println("Complete by EOD");
	}
	public void doActivity() {
		System.out.println("Team Lunch");
	}
}

class TechDepartment extends SuperDepartment{
	public void departmentName() {
		System.out.println("\n\nWelcome to Tech Department");
	}
	public void getTodaysWork() {
		System.out.println("Complete coding of module 1");
	}
	public void getWorkDeadline() {
		System.out.println("Complete by EOD");
	}
	public void getTechStackInformation() {
		System.out.println("Core JAVA");
	}
}