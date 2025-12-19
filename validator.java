import java.util.*;

public class validator{
    public static boolean isValid(String cardNum){
        if (16 != cardNum.length()){
            return false;
        }
        int count = 1;
        int sum = 0;

        for(int i=cardNum.length()-1;i>=0;i--){
            int digit = Integer.parseInt(Character.toString(cardNum.charAt(i)));

            if(count%2 == 0){
                digit*=2;
            }
            if(digit > 9){
                digit -= 9;
            }
            sum+=digit;
            count++;
        }
        if(sum%10 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String cardNum = input.nextLine();
        if(isValid(cardNum)){
            System.out.println("valid");
        }else{
            System.out.println("not valid");
        }
        input.close();
    }
}
