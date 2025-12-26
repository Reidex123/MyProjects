public class safetyDepositBoxes{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        String[] box = (input.nextLine()).split(",");
        String target = input.nextLine();

        int time = 0;

        for (String item : box) {

            if (item.equalsIgnoreCase(target)) {
                time += 5;
                break;
            } else {
                time += 5;
            }

        }

        System.out.println(time);

        input.close();
    }
}