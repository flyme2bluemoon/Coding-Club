public class java_demo {
    public static void main(String[] args) {
        // declaring a variable
        int my_integer = 50;
        System.out.println(my_integer);

        // String (object)
        String my_string = "Today is December 1, 2020!";
        System.out.println(my_string);

        // Maths!!
        System.out.println(1 + 1);
        System.out.println(2 - 0.5);
        System.out.println(5 * 6);
        System.out.println((double)5 / (double)2);
        System.out.println(5 % 2);

        // Loops and conditionals
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int j = 0;
        while (j < 10) {
            System.out.println(j);
            j++;
        }

        if (true) {
            System.out.println("Your computer is working");
        } else {
            System.out.println("Get your computer fixed");
        }
    }
}
