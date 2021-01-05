public class Power {
    public static int power(int base, int exponent) {
        int answer = 1;

        if (base == 0) {
            return 0;
        }

        for (int i = 0; i < exponent; i++) {
            answer *= base;
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}