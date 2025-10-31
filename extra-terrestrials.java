import java.util.*;

public class extra-terrestrials{

  // reverse the English word
  public static String translate(String word){
    String result = "";
    int index = word.length() - 1;
    for (int i = index; i >= 0; i--){
      result += word.charAt(i);
    }

    return result;
  }
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    String englishWord = input.nextLine();
    String newWord = translate(englishWord);

    System.out.println(newWord);
  }
}
