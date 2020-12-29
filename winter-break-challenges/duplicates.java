import java.util.ArrayList;

public class duplicates {
    public static void main (String[] args) {
        int[] array = {6, 2, 7, 1, 3, 2, 2, 0, 3, 4, 2, 6, 9, 6, 6};
        ArrayList<Integer> set = new ArrayList<Integer>();
        
        for (int i: array) {
            if (!set.contains(i)) {
                set.add(i);
            }
        }

        for (int i = 0; i < set.size(); i++) {
            System.out.println(set.get(i));
        }
    }
}