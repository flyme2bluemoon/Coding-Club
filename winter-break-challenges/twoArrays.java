public class twoArrays {
    public static void main (String[] args) {
        int array_one[] = {1, 2, 3, 4};
        int array_two[] = {1, 4, 9, 16};
        // int array_two[] = {1, 4, 16};
        // int array_one[] = {};
        // int array_two[] = {};

        if (array_one.length != array_two.length) {
            System.out.println(false);
            System.exit(1);
        } else if (array_one.length == 0 && array_two.length == 0) {
            System.out.println(true);
            System.exit(0);
        }

        boolean output = true;

        for (int i = 0; i < array_one.length; i++) {
            if (array_one[i] * array_one[i] != array_two[i]) {
                output = false;
            }
        }

        System.out.println(output);
    }
}
