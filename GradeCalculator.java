import java.util.Scanner;
  // Calculates grades for a student uisng the formula
  // 25% homework Average, 25% quiz average and 50% test average. 


public class GradeCalculator 
{
  	private static Scanner input;
    
    public static void main( String[] agrs)
    {
     	input = new Scanner(System.in );
      int choice = mainMenu();
      	
     	 while (choice == 1) 
     	 {
      		System.out.println( "student name");
        	String name = input.next();
      
      System.out.println("Enter 1 for homework grades ");
      System.out.println(" Enter 2 for quiz grades ");
      System.out.println("Enter 3 for test grades ");
      System.out.println("Enter -1 to move on to the next category ");

      	System.out.println("Enter Homework grades");
				double hwAverage = averageMethod();
				
				System.out.println("Enter Quiz grades");
				double quizAverage = averageMethod();
				
				System.out.println("Enter Test grades");
				double testAverage = averageMethod();
				
				double finalAverage = 0.25*hwAverage + 0.25*quizAverage + 0.50*testAverage;
				System.out.println(name + "'s final average is " + finalAverage);
				choice = mainMenu();
			}

    	}//end of main method

    	public static double averageMethod() {
        	int grade = 0;
        	int gradeCounter = 0;
        	double average = 0;
        	int sum = 0;        	
        	do	{
        		grade = input.nextInt();
        		if ( grade!= -1) {
        			sum = grade + sum;
        			gradeCounter = gradeCounter + 1;
        		}
        	} // end of averageMethod
          
           while(grade != -1);
        
        	 if(gradeCounter > 0)
        	{
          	 average =  sum /gradeCounter;
        	}
       		 return average;
        }

    public static int mainMenu()
    {
    		
    		System.out.println("Enter 1 for Average grades for a new student ");
            System.out.println("Enter 2 to Quit ");
    		int choice = input.nextInt();
    		return choice;

    }
}
  