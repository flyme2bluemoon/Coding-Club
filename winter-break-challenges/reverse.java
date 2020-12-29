public class reverse {
    public static void main (String[] args) {
        char[] array = {'a', 'b', 'c', 't'};
        System.out.print("{");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.printf("%c, ", array[i]);
        }
        System.out.println("\b\b}");
    }
}