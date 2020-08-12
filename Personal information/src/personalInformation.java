import java.util.*;
// Sales Prediction.
//Company annual profit is 23% of total sales.
// 1 this program ask the user to enter a project amount.
// 2 Calculation (projected amount * annual profit).
// 3 Finally display the profit. 

public class personalInformation {

  public static void main(String[] args) {
    
 // Declaring the Annual profit as a constant for ex requirements
    final double ANNUAL_PROFIT = 0.23;
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the projected amount: " );
    double projectedAmount = sc.nextDouble();
    
    double profit = projectedAmount*ANNUAL_PROFIT;
    
    System.out.println("The anual profit is: $"+profit);
    
  }
}
 