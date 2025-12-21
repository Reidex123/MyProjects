public class Pig_Latin{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        String[] sentence = (input.nextLine()).split(" ");

        for (String word : sentence) {
            String builder = "";

            for (int i = 1; i < word.length(); i++) {
                builder += word.charAt(i);
            }

            builder += word.charAt(0);
            builder += "ay ";

            if (word.equalsIgnoreCase(sentence[sentence.length - 1])) {
                System.out.println(builder);
                continue;
            }

            System.out.print(builder);

            builder = "";
        }

        input.close();
    }
}