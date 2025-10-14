import java.util.*;

public class IzzytheIguana{

    public final static int totalPoints = 10;
    public final static int lettuce = 5;
    public final static int carrot = 4;
    public final static int mango = 9;
    public final static int cheeseBurger = 0;

    public static void main(String[] args){
        ArrayList<String> snacks = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        String userInput = input.nextLine();
        for (int i = 0; i < userInput.length(); i++){
            String result = "";
            if (userInput[i].equals(" ")){
                snacks.add(result);
                continue;
            }
            else{
                result += userInput[i];
            }
        }

        int points = 0;
        for (String j: snacks){
            if (j.equalsIgnoreCase("lettuce")){
                points += lettuce;
            }
            else if (j.equalsIgnoreCase("carrot")){
                points += carrot;
            }
            else if (j.equalsIgnoreCase("mango")){
                points += mango;
            }
            else{
                point += cheeseBurger;
            }
        }

        if (points >= totalPoints){
            System.out.println("Come on Down!");
        }
        else{
            System.out.println("Time to wait");
        }
        
        input.close();
    }
}