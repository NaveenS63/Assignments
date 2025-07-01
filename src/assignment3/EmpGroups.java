package assignment3;

public class EmpGroups extends Employees {

	public static void main(String[] args) {
		Employees obj = new EmpGroups();

		// Employee Names
		String[] EmployeeNames = new String[3];
		EmployeeNames[0] = obj.EmployeeName1;
		EmployeeNames[1] = obj.EmployeeName2;
		EmployeeNames[2] = obj.EmployeeName3;

		// Employee IDs
		int[] EmployeeIds = new int[3];
		EmployeeIds[0] = obj.EmployeeId1;
		EmployeeIds[1] = obj.EmployeeId2;
		EmployeeIds[2] = obj.EmployeeId3;

		// Employee Name: Bharath, Employee ID: 1234
		System.out.println("Employee Name: " + "\"" + EmployeeNames[0] + "\"" + ", " + "Employee ID: " + "\""
				+ EmployeeIds[0] + "\"");
		System.out.println("Employee Name: " + "\"" + EmployeeNames[1] + "\"" + ", " + "Employee ID: " + "\""
				+ EmployeeIds[1] + "\"");
		System.out.println("Employee Name: " + "\"" + EmployeeNames[2] + "\"" + ", " + "Employee ID: " + "\""
				+ EmployeeIds[2] + "\"");

	}

}
