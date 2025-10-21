import java.util.*;

public class landHo{
  public static int trip = 10;

  // determine waiting time
  public static int total(int numPassengers){
    return (!(numPassengers/20 == 0) ? (numPassengers/20)*trip: trip); 
  }
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    int numPassengers = input.nextInt();
    int time = total(numPassengers);

    System.out.println(time);
  }
}
