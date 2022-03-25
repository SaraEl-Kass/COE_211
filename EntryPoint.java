import java.util.Scanner;
public class EntryPoint {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Which service would you like to use?\n[1] : Basic week visualizer\n[2] : Advanced week visualizer\n[3] : Basic calculator\n[4] : Employee repertpoire");
		int input = scan.nextInt();
			if (input == 1) {
				BasicWeek basicWeek = new BasicWeek();
				basicWeek.printDays();
			}
			if (input == 2) {
				AdvancedWeek advancedWeek = new AdvancedWeek();
				advancedWeek.printDays();
			}
			if (input == 3) {
				Calculator calc = new Calculator();
			}
			if (input == 4) {
				Employee employee = new Employee();
				System.out.println(employee);
			}
				
			


	}
}