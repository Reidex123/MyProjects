import java.util.*;

public class multiples{

  // find the multiples of 3 of the given number
  public static ArrayList<Integer> multiplesOf3(int num){
    ArrayList<Integer> mult = new ArrayList<Integer>();
    
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
  public static ArrayList<Integer> multiplesOf3_5(ArrayList<Integer> mult1, ArrayList<Integer> mult2){
    ArrayList<Integer> result = new ArrayList<Integer>();
    
    for (int i = 0; i < mult1.size(); i++){
      result.add(mult1.get(i));
    }
    
    for (int i = 0; i < mult2.size(); i++){
      if (result.contains(mult2.get(i))){
        continue;
      } else{
        result.add(mult2.get(i));
      }
    }

    return result;
  }

  // calculate the sum of all the multiples
  public static int sum(ArrayList<Integer> mult){
    int sum = 0;
    for (int i = 0; i < mult.size(); i++){
      sum += mult.get(i);
    }

    return sum;
  }

  // main program 
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int userInput = input.nextInt();

    ArrayList<Integer> mult1 = multiplesOf3(userInput);
    ArrayList<Integer> mult2 = multiplesOf5(userInput);

    ArrayList<Integer> mult = multiplesOf3_5(mult1, mult2);

    int total = sum(mult);

    System.out.println(total);

    input.close();
  }
}
