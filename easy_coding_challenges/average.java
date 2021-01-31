import java.util.*;
import java.io.*;

public class average {
    public static void main (String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        double total = 0;
        
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int tmp = in.nextInt();
            total += tmp;
        }

        System.out.println(total / n);
    }
}