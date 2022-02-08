package assignment1.iitr.greatlearning;

public class Main {

	public static void main(String[] args) {
		AdminDepartment adm = new AdminDepartment();
		adm.departmentName();
		adm.getTodaysWork();
		adm.getWorkDeadline();
		adm.isTodayAHoliday();
		
		HRDepartment hrd = new HRDepartment();
		hrd.departmentName();
		hrd.getTodaysWork();
		hrd.getWorkDeadline();
		hrd.doActivity();
		hrd.isTodayAHoliday();
		
		TechDepartment td = new TechDepartment();
		td.departmentName();
		td.getTodaysWork();
		td.getWorkDeadline();
		td.getTechStackInformation();
		td.isTodayAHoliday();

	}

}
