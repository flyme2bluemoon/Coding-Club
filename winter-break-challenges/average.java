public class sumOfArray {
    public static void main (String[] args) {
        int[] array = {1, 3, 6, 15, 78, 94};
        double sum = 0;

        for (int i: array) {
            sum += i;
        }

        double average = sum / array.length;

        System.out.println(average);
    }
}