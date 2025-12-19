import java.util.*;

public class neverLand{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int myAge = input.nextInt();
    int yearsElapsed = input.nextInt();

    int twinAge = myAge + yearsElapsed;

    if (yearsElapsed <= 1)
      System.out.printf("My twin is %d years old and they are %d year older than me", twinAge, yearsElapsed);
    else
      System.out.printf("My twin is %d years old and they are %d years older then me", twinAge, yearsElapsed);

    input.close();
  }
}
