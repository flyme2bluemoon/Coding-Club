import java.util.Scanner;  

/*
- TroyMartian, who has at least 3 antenna and at most 4 eyes;
- VladSaturnian, who has at most 6 antenna and at least 2 eyes;
- GraemeMercurian, who has at most 2 antenna and at most 3 eyes.
*/

public class whichalien {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many antennas?");
        int antennas = input.nextInt();

        System.out.println("How many eyes?");
        int eyes = input.nextInt();

        String[] alien_names = {"TroyMartian", "VladSaturnian", "GraemeMercurian"};
        boolean[] aliens = {true, true, true};

        if (antennas < 3 || eyes > 4) {
            aliens[0] = false;
        }
        if (antennas > 6 || eyes < 2) {
            aliens[1] = false;
        }
        if (antennas > 2 || eyes > 3) {
            aliens[2] = false;
        }

        for (int i = 0; i < 3; i++) {
            if (aliens[i]) {
                System.out.println(alien_names[i]);
            }
        }
    }
}