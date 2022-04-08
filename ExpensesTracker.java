import java.io.*;
import java.util.Scanner;

public class ExpensesTracker{
  public static void main(String[] args) throws IOException{
      // Create FileWriter & Scanner objects & y/n string
		Scanner scan = new Scanner (System.in);
		File expenses = new File ("expenses.txt");
		FileWriter fw = new FileWriter(expenses);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		String yn;
		
      // Start gathering information inside the loop you will start
		System.out.println("Input you Name: ");
		String name = scan.nextLine();

		do {
			System.out.println("What did you purchase? ");
			String purchase = scan.nextLine();
			System.out.println("How much did you pay? (in USD)");
			double price = scan.nextDouble();
			pw.print(name + " purchased " + purchase + " for " + price + " US Dollars.");
			pw.println();
			scan.nextLine();
			System.out.println("Would you like to log another purchase? (y/n)");
			yn = scan.nextLine();

		}while (yn.equalsIgnoreCase("y"));

		if(yn.equalsIgnoreCase("n")) {

				System.out.println("Get off of ZoodMall!");
			
		}
      // Close ClassWriter & Scanner objects
        	scan.close();
		pw.close();
        
      // If you have already have a expenses.txt file, you need to delete it
      // before you compile your code again
  }
}
