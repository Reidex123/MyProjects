
/**
 * Program to validate credit card number
 * @author Koketso Gaowelwe
 * 16/11/2025
 */

import java.util.*;

public class validator {

    // methods applying Luhn's algorithm to validate Card number

    // 1. reverse cardNumber
    private static ArrayList<Integer> reverse(String cardNum) {
        ArrayList<Integer> temp = new ArrayList<Integer>();

        for (int i = cardNum.length() - 1; i >= 0; i--) {
            temp.add(Integer.parseInt(Character.toString(cardNum.charAt(i))));
        }

        return temp;
    }

    // 2. Multiply every second digit by 2
    private static void multiply2(ArrayList<Integer> reversedCardNum) {

        for (int i = 1; i < reversedCardNum.size(); i += 2) {
            reversedCardNum.set(i, (reversedCardNum.get(i)) * 2);
        }
    }

    // 3. Subtract 9 from all numbers higher than 9
    private static void subtract(ArrayList<Integer> cardNum) {

        for (int i = 0; i < cardNum.size(); i++) {
            cardNum.set(i, (cardNum.get(i) > 9) ? cardNum.get(i) - 9 : cardNum.get(i));
        }
    }

    // 4. Add all digits together
    private static int sum(ArrayList<Integer> cardNum) {

        int temp = 0;
        for (int i = 0; i < cardNum.size(); i++) {
            temp += cardNum.get(i);
        }
        return temp;
    }

    // 5. Modulo of the sum has to be 0
    private static boolean modulo(int sum) {

        return (sum % 10 == 0) ? true : false;
    }

    // main program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String user = input.nextLine();

        ArrayList<Integer> reversedCardNum = reverse(user);

        multiply2(reversedCardNum);
        subtract(reversedCardNum);

        int sumDigits = sum(reversedCardNum);

        if (modulo(sumDigits)) {
            System.out.print("Valid");
        } else {
            System.out.print("not Valid");
        }


        input.close();
    }
}