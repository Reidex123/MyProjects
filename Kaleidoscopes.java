import java.util.*;

public class Kaleidoscopes{
  
  public static double discount = 0.1d;
  public static double tax = 0.07d;
  public static double productCost = 5.0d;

  public static double total(int order){
    double total = 0.0d;
    double quantityCost = order*productCost;

    double discountAmount = discount*quantityCost;
      
    if (order > 1){
      // calculate the total with discount
      total = quantityCost - discountAmount;      
    } else{
      // calculate total without discount
      total = quantityCost;
    }
    double taxAmount = tax*total;
    return total + taxAmount;
  }

  // Main program
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int order = input.nextInt();

    double cost = total(order);

    System.out.printf("%.2f", cost);
  }
}
