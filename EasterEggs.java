import java.util.*;

public class EasterEggs{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int totalEggs = input.nextInt();
        int yourBasket = input.nextInt();
        int friendsBasket = input.nextInt();

        int total = yourBasket + friendsBasket;

        if (total == totalEggs){
            System.out.println("Candy Time");
        }
        else{
            System.out.println("Keep Hunting");
        }

        input.close();
    }
}