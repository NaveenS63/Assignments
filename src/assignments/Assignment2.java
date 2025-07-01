package assignments;

public class Assignment2 {

	public static void main(String[] args) {

		String[][][] StudentMarks = new String[5][6][2];

		// Semester 1 Mark Details
		StudentMarks[0][0][0] = "Mathematics I";
		StudentMarks[0][0][1] = "Pass(78)";
		StudentMarks[0][1][0] = "Physics";
		StudentMarks[0][1][1] = "Pass(85)";
		StudentMarks[0][2][0] = "Chemistry";
		StudentMarks[0][2][1] = "Fail(21)";
		StudentMarks[0][3][0] = "Computer Programming";
		StudentMarks[0][3][1] = "Pass(74)";
		StudentMarks[0][4][0] = "Engineering Drawing";
		StudentMarks[0][4][1] = "Pass(88)";
		StudentMarks[0][5][0] = "Basic Electrical Eng.";
		StudentMarks[0][5][1] = "Pass(79)";

		// Semester 2 Mark Details
		StudentMarks[1][0][0] = "Mathematics II";
		StudentMarks[1][0][1] = "Pass(82)";
		StudentMarks[1][1][0] = "Mechanics";
		StudentMarks[1][1][1] = "Pass(77)";
		StudentMarks[1][2][0] = "Environmental Sci.";
		StudentMarks[1][2][1] = "Pass(93)";
		StudentMarks[1][3][0] = "Basic Electronics";
		StudentMarks[1][3][1] = "Fail(19)";
		StudentMarks[1][4][0] = "Engineering Physics";
		StudentMarks[1][4][1] = "Fail(24)";
		StudentMarks[1][5][0] = "Engineering Graphics";
		StudentMarks[1][5][1] = "Pass(90)";

		// Semester 3 Mark Details
		StudentMarks[2][0][0] = "Data Structures";
		StudentMarks[2][0][1] = "Pass(88)";
		StudentMarks[2][1][0] = "Discrete Mathematics";
		StudentMarks[2][1][1] = "Pass(81)";
		StudentMarks[2][2][0] = "Digital Electronics";
		StudentMarks[2][2][1] = "Pass(76)";
		StudentMarks[2][3][0] = "Operating Systems";
		StudentMarks[2][3][1] = "Fail(32)";
		StudentMarks[2][4][0] = "Signals and Systems";
		StudentMarks[2][4][1] = "Pass(85)";
		StudentMarks[2][5][0] = "Object-Oriented Prog.";
		StudentMarks[2][5][1] = "Pass(78)";

		// Semester 4 Mark Details
		StudentMarks[3][0][0] = "Algorithms";
		StudentMarks[3][0][1] = "Pass(91)";
		StudentMarks[3][1][0] = "Computer Networks";
		StudentMarks[3][1][1] = "Pass(73)";
		StudentMarks[3][2][0] = "Database Systems";
		StudentMarks[3][2][1] = "Fail(19)";
		StudentMarks[3][3][0] = "Microprocessors";
		StudentMarks[3][3][1] = "Pass(80)";
		StudentMarks[3][4][0] = "Communication Eng.";
		StudentMarks[3][4][1] = "Pass(76)";
		StudentMarks[3][5][0] = "Software Engineering";
		StudentMarks[3][5][1] = "Pass(87)";

		// Semester 5 Mark Details
		StudentMarks[4][0][0] = "Probability Stats";
		StudentMarks[4][0][1] = "Pass(86)";
		StudentMarks[4][1][0] = "Machine Learning";
		StudentMarks[4][1][1] = "Pass(88)";
		StudentMarks[4][2][0] = "Compiler Design";
		StudentMarks[4][2][1] = "Pass(84)";
		StudentMarks[4][3][0] = "Theory of Computation";
		StudentMarks[4][3][1] = "Pass(95)";
		StudentMarks[4][4][0] = "Embedded Systems";
		StudentMarks[4][4][1] = "Pass(73)";
		StudentMarks[4][5][0] = "Computer Graphics";
		StudentMarks[4][5][1] = "Pass(90)";

		// Print Semester 2 Subject 4 and Subject 5 names.
		System.out.println("Semester 2 - The 4th Subject Name is " + "\"" + StudentMarks[1][4][0] + "\"" + " and "
				+ "Semester 2 - The 5th Subject Name is " + "\"" + StudentMarks[1][5][0] + "\"");

		// Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
		System.out.println("Semester 4 - The Status/Marks of 3rd Subject is " + "\"" + StudentMarks[3][2][1] + "\"" + " and "
				+ "Semester 4 - The Status/Marks of 6th Subject is " + "\"" + StudentMarks[3][5][1] + "\"");
	}

}
