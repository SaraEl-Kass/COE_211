import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
        Scanner scanCalc = new Scanner(System.in);
			System.out.println("Input first number:");
			 num1 = scanCalc.nextInt();
			System.out.println("Input the operator:");
			scanCalc.nextLine();
			 operator = scanCalc.nextLine();
			System.out.println("Input second number:");
			 num2 = scanCalc.nextInt();

	// Decide on the operation to perform 
	if (operator.equals("+"))
		add(num1, num2);
	if (operator.equals("x"))
		multiply(num1, num2);
	if (operator.equals("/"))
		divide(num1, num2);	
	if (operator.equals("-"))
		subtract(num1, num2);
    }

    public void add(int a, int b) {
        int ans= a + b;
	String output = num1 + " + " + num2 + " = " + ans;
	System.out.println(output);
      
    }

    public void subtract(int a, int b) {
         int ans = a - b;
         String output = num1 + " - " + num2 + " = " + ans;
	System.out.println(output);
         
    }

    public void multiply(int a, int b) {
	int ans = a * b; 
        String output = num1 + " x " + num2 + " = " + ans;
	System.out.println(output);
	
         
    }

    public void divide(int a, int b) {
        double ans = a / b;
        String output = num1 + " / " + num2 + " = " + ans;
	System.out.println(output);
    }
}