public class Krispies{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        int[] userInputs = new int[6];

        // Take 6 integers which represents the number of Rice Krispies in the bowls
        for (int i = 0; i < 6; i++) {
            userInputs[i] = input.nextInt();
        }

        for (int num : userInputs) {
            if (num % 3 == 0) {
                System.out.print("Pop ");
            }
            else if (!(num % 3 == 0) && !(num % 2 == 0)) {
                System.out.print("Snap ");
            }
            else{
                System.out.print("Crackle ");
            }
        }

        input.close();
    }
}