import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class partners {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        boolean good = true;

        int n = input.nextInt();

        String[] names = new String[n];
        String[] partners = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = input.next();
        }
        for (int i = 0; i < n; i++) {
            partners[i] = input.next();
        }

        for (int i = 0; i < n; i++) {
            if (!partners[Arrays.asList(names).indexOf(partners[i])].equalsIgnoreCase(names[i])) {
                good = false;
                break;
            }
        }
        
        if (good) {
            System.out.println("good");
        } else [
            System.out.println("bad");
        ]
    }
}
