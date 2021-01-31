import java.util.*;
import java.io.*;
import java.lang.Math;

public class moving {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int dollars = in.nextInt();
        double paycheck = 15.00;

        double hours_required = Math.ceil(dollars / paycheck);

        System.out.println(hours_required);
    }
}