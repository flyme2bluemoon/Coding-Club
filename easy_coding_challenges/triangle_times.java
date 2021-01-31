import java.util.*;
import java.io.*;

public class triangle_times {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a + b + c != 180) {
            System.out.println("Error");
        } else if (a == 60 && b == 60) {
            System.out.println("Equilateral");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}