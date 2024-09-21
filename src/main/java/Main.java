import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    

    System.out.println("Enter your height in feet and then on the next line enter the number of inches:  \n");
    int feet = scanner.nextInt();
    int inches = scanner.nextInt();
    System.out.println("\nEnter your weight in pounds: \n");

    //Assign variables and calculate BMI
    
    int weight = scanner.nextInt();
    
    int height = (feet * 12) + inches;
    double bmi = (weight * 704.5) / (height * height);

    //A series of if statements to deterimine BMI and to get a message based on your BMI.
    
    if (bmi <= 17) {
      System.out.println("Your BMI is " + bmi + " and you are underweight.  You need to lift weights and drink protien shakes!");
      
    } else if (bmi >= 18 && bmi <= 25) {
      System.out.println("Your BMI is " + bmi + " and you are normal weight.  Keep up the good work!");
      
    } else if (bmi >= 25 && bmi <= 29) {
      System.out.println("Your BMI is " + bmi + " and you are overweight.  You lack discipline in your life.  You need to workout more, cut out the sugars, and eat less.");
      
    } else if (bmi >= 30 && bmi <=39 ) {
      System.out.println("Your BMI is " + bmi + ", you are obese.  You need to get discipline in your life, workout a lot and eat little.");
      
    } else if (bmi >= 40) {
      System.out.println("Your BMI is " + bmi + ", you are a food blister.  You need to get discipline in your life, workout a lot and stop eating.");
      
    } else {
      System.out.println("Error in input.  Please try again");
      
    }
      
    }
      
}
    
   

 
