import java.util.ArrayList;
import java.util.Scanner;

public class pascal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer[]> pascal = new ArrayList<Integer[]>();

        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            pascal.add(new Integer[i]);
            pascal.get(i - 1)[0] = 1;
            pascal.get(i - 1)[pascal.get(i - 1).length - 1] = 1;
            for (int j = 1; j < i - 1; j++) {
                pascal.get(i - 1)[j] = pascal.get(i - 2)[j - 1] + pascal.get(i - 2)[j];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("[");
            for (int j = 0; j < pascal.get(i).length; j++) {
                System.out.printf("%d ", pascal.get(i)[j]);
            }
            System.out.println("\b]");
        }
    }
}
