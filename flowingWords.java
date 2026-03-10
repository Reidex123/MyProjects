public class flowingWords{

    public static void main(String[] args){

        try(java.util.Scanner input = new java.util.Scanner(System.in)){

            System.out.println("Enter input string(sentence):");
            String[] sentenceWords = (input.nextLine()).split(" ");

            System.out.println(sentenceWords);
        }

    }

}