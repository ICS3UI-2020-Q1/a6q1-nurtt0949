import java.util.Scanner;
/**
 *Heights and their averages
 * @author Tolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a Scanner
    Scanner input = new Scanner(System.in);
    
    //ask user for how many heights they would like to enter
    System.out.println("How many heights would you like to enter?");
    
    //declare a varaible to store users heights
    final int USER_HEIGHT = input.nextInt();
    //create an array with users amount of spots
    double[] heights = new double[USER_HEIGHT];
    //ask user to enter lines 
    System.out.println("Please enter the heights on seperate lines");
    //put heights into array into for loop
    for(int i = 0; i < heights.length; i++){
     heights[i] = input.nextDouble();
    }
    //create a variable to store the sum
    double sum = 0;
    //use a for loop to go through array
    for(int i = 0; i < heights.length; i++){
      sum = sum + heights[i];
    }
    //determine the average
    double average = sum / USER_HEIGHT;
    //let the user know 
    System.out.println("Your average height is " + average + "cm");
    //tell user their heights above average
    
        System.out.println("Your heights above average are ");
    
    //tell user their heights above average
    for(int i = 0; i < heights.length; i++){
       if(heights[i] > average){
        System.out.println(heights[i]);
       
      }
    }   
    
  }
}
