public class AdvancedWeek {
    // Initializing variables
    private String day_1;
    private int day_1_index;
    private String day_2;
    private int day_2_index;
    private String day_3;
    private int day_3_index;
    private String day_4 ;
    private int day_4_index;
    private String day_5;
    private int day_5_index;
    private String day_6;
    private int day_6_index;
    private String day_7;
    private int day_7_index; 
   
	public AdvancedWeek() {
	 day_1 = "Monday";
         day_1_index = 1;
    	 day_2 = "Tuesday";
     	 day_2_index = 2;
    	 day_3 = "Wednesay";
    	 day_3_index = 3;
     	 day_4 = "Thursday";
    	 day_4_index = 4;
     	 day_5 = "Friday";
    	 day_5_index = 5;
   	 day_6 = "Saturday";
    	 day_6_index = 6;
    	 day_7 = "Sunday";
   	 day_7_index = 7;
	
	}

    // printing out the days
    public void printDays() {
        System.out.println( "The advanced days of the week are:\n" + 
			 day_1_index + ": " + day_1 +"\n" + 
			 day_2_index + ": " + day_2 +"\n" + 
			 day_3_index + ": " + day_3 +"\n" + 
			 day_4_index + ": " + day_4 +"\n" + 
			 day_5_index + ": " + day_5 +"\n" + 
			 day_6_index + ": " + day_6 +"\n" + 
			 day_7_index + ": " + day_7 +"\n"  );
    }
}