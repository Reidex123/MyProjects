public class flowingWords{

    public static final java.util.Stack<Character> lettersStack = new java.util.Stack<>();
    public static void main(String[] args){

        try(java.util.Scanner input = new java.util.Scanner(System.in)){

            System.out.println("Enter input string(sentence):");
            String[] sentenceWords = (input.nextLine()).split(" ");

            boolean results = false;

            for (String word: sentenceWords){
                if (lettersStack.empty()){
                    lettersStack.push(java.lang.Character.valueOf(word.charAt(0)));
                    lettersStack.push(java.lang.Character.valueOf(word.charAt(word.length()-1)));
                }

                else{

                    if (java.lang.Character.toString(lettersStack.peek()).equals(java.lang.Character.toString(Character.valueOf(word.charAt(0))))){
                        lettersStack.push(java.lang.Character.valueOf(word.charAt(word.length()-1)));
                        results = true;
                    }else{
                        results = false;
                        break;
                    }
                }
            }

            if (results){
                System.out.println(results);
                Runtime.getRuntime().exit(0);
            }

            System.out.println(results);
        }

    }

}