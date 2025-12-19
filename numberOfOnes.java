import java.util.*;

public class numberOfOnes{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int integer = input.nextInt();
        String binary = Integer.toBinaryString(integer);

        int countOnes = 0;
        for (int i = 0; i < binary.length(); i++){
            if (binary.charAt(i) == '1'){
                countOnes++;
            }
        }

        System.out.println(countOnes);

        input.close();
    }
}
