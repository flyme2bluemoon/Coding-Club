public class sumAdvanced {
    public static void main (String[] args) {
        double[] array =  {1, 5.2, 4, 0, -1};
        double sum = 0;

        for (double i: array) {
            sum += i;
        }

        System.out.println(sum);
    }
}