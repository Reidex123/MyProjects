import java.util.*;

public class jungleCamping{

  // animal sounds
  public static String Lion = "Grr";
  public static String Tiger = "Rawr";
  public static String Snake = "Ssss";
  public static String Bird = "Chirp";

  // create an array of animal sounds
  public static ArrayList<String> sound(String noises){
    ArrayList<String> result = new ArrayList<String>();

    String word = "";
    for (int i = 0; i < noises.length(); i++){
      if (noises.charAt(i) != ' '){
        word += noises.charAt(i);
      } else{
        result.add(word);
        word = "";
      }
    }
    // add the remaining word to the list
    result.add(word);
    return result;
  }

  // determine which animal sound is it
  public static String animals(ArrayList<String> sounds){
    String result = "";

    for (int i = 0; i < sounds.size(); i++){
      if (sounds.get(i).equals(Lion)){
        result += "Lion ";
      } else if (sounds.get(i).equals(Tiger)){
        result += "Tiger ";
      } else if (sounds.get(i).equals(Snake)){
        result += "Snake ";
      } else {
        result += "Bird ";
      }
    }
    return result.trim();
  }

  // main program
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    String noises = input.nextLine();
    ArrayList<String> animalSounds = sound(noises);

    String output = animals(animalSounds);
    System.out.println(output);

    input.close();
  }
}
