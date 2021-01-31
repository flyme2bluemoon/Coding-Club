import java.util.*;
import java.io.*;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        String input_string = in.nextLine();

        for (int i = input_string.length() - 1; i >= 0; i--) {
            System.out.print(input_string.charAt(i));
        }
        System.out.println();
    }
}