public class contiguous {
    public static void main (String[] args) {
        int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};
        int largest_sum = 0;

        for (int i = 0; i < array.length; i++) {
            int tmp_sum = 0;
            for (int j = i; j < array.length; j++) {
                tmp_sum += array[j];
                if (tmp_sum > largest_sum) {
                    largest_sum = tmp_sum;
                }
            }
        }

        System.out.println(largest_sum);
    }
}