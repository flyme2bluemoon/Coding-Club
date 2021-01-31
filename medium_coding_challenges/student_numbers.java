import java.util.*;
import java.io.*;
import java.lang.*;

public class student_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        String email = in.nextLine();
        long student_number = 0;
        for (int i = 0; i < email.length(); i++) {
            if (Character.isDigit(email.charAt(i))) {
                student_number *= 10;
                student_number += Character.getNumericValue(email.charAt(i));
            }
        }

        System.out.println(student_number);
        System.out.println(Math.sqrt(student_number));
    }
}