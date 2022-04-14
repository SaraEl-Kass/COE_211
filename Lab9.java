import java.util.Scanner;
public class Lab9 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int assignments = 0, attendance, midterm;
	double grade1, grade2, grade3;

        // Initialize array of integers

	int[] assignment = new int[5];

        // for loop to get user input & store in array

	for(int idx=0; idx < assignment.length; idx++) {
		System.out.println("Input the grade of assignment " + (idx + 1));
		assignment[idx] = scan.nextInt();
	}

	System.out.println("Input the number of attended labs");
	attendance = scan.nextInt();

	System.out.println("Input the number midterm");
	midterm = scan.nextInt();

        // for loop to iterate over the array & perform calculations

	for(int grade : assignment) {
		assignments += grade;
	}
	grade1 = (assignments * 0.3)/ assignment.length;
	grade2 = (attendance * 100 * 0.05) / 7;
	grade3 = midterm * 0.3;

        // display output to user

	System.out.println("Assignments (30%): " + grade1 + "\n" +
			"Attendance (5%): " + grade2 + "\n" +
			"Midterm (30%): " + grade3);
    }
}