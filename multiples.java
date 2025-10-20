import java.util.*;

public class multiples{

  // find the multiples of 3 of the given number
  public static ArrayList<Integer> multiplesOf3(int num){
    ArrayList<Integer> mult = new ArrayList<Integer>;
    for (int i = 0; i < num; i++){
      if (i%3 == 0){
        mult.add(i);
      }
    }
    return mult;
  }

  // find the multiples of 5 of the given number
  public static ArrayList<Integer> multiplesOf5(int num){
    ArrayList<Integer> mult = new ArrayList<Integer>();
    for (int i = 0; i < num; i++){
      if (i%5 == 0){
        mult.add(i);
      }
    }
    return mult;
  }

  // find the multiples of both 3 and 5 without repetition
  public static ArrayList<Integer> multiplesOf3_5(int[] mult1, int[] mult2){
    ArrayList<Integer> result = new ArrayList<Integer>();
    for (int i = 0; i < mult1.length; i++){
      int num = mult1[i];
      for (int j = 0; j < mult2.length; j++){
        int num2 = mult2[j];
        if (num == num2){
          continue;
        } else{
            result += num2;
        }
      }
      if ()
    }
  }
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int userInput = input.nextInt();

    int[] mult1 = multiplesOf3(userInput);
    int[] mult2 = multiplesOf5(userInput);
  }
}
