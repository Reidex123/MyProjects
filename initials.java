import java.util.*;

public class initials {
    public static final List<String[]> names = new ArrayList<>();

    public static void evaluateInitials(List<String[]> names) {

        for (String[] name : names) {
            System.out.print(process(name) + " ");
        }

    }

    private static String process(String[] name) {
        String tempInit = "";

        for (String word : name) {
            tempInit += word.charAt(0);
        }

        return tempInit;
    }

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int query = input.nextInt();
            input.nextLine();

            for (int i = 0; i < query; i++) {
                String nameSurname = input.nextLine();
                names.add(nameSurname.split(" "));
            }

            evaluateInitials(names);

        }

    }

}