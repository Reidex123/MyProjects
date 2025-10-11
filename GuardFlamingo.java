import java.util.*;

public class GuardFlamingo{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int x = 2;

        int length, width, parameter, flamingos;

        length = in.nextInt();
        width = in.nextInt();

        parameter = length * x + width * x;

        flamingos = parameter / x;

        System.out.println(flamingos);

        in.close();
    }
}