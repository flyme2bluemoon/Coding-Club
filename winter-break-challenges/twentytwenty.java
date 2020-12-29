import java.util.Arrays;

public class twentytwenty {
     public static void main (String[] args) {
         Integer array[] = {1721, 979, 366, 299, 675, 1456};
        //  boolean test = Arrays.asList(array).contains(1721);

        for (int i = 0; i < array.length; i++) {
            if (Arrays.asList(array).contains(2020 - array[i])) {
                System.out.printf("%d %d\n", array[i], 2020 - array[i]);
            }
        }
     }   
}
