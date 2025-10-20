import java.util.*;

public class Kaleidoscopes{
  public static double discount = 0.1d;
  public static double tax = 0.07d;
  public static double productCost = 5.0d;

  public static double total(int customer){
    if (customer > 1){
      // calculate the total with discount
    } else{
      // calculate total without discount
    }
  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int customer = input.nextInt();

    double cost = total(customer);

    System.out.println(cost);
  }
}
