public class sumOfArray {
    public static void main (String[] args) {
        int[] array = {1, 3, 6, 15, 78, 94};
        int sum = 0;

        for (int i: array) {
            sum += i;
        }

        System.out.println(sum);
    }
}