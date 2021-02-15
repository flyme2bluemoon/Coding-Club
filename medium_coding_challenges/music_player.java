import java.util.*;
import java.io.*;
import java.lang.*;

public class music_player {
    public static void option_one(String[] songs) {
        String first_song = songs[0];
        for (int i = 0; i < songs.length - 1; i++) {
            songs[i] = songs[i + 1];
        }
        songs[songs.length - 1] = first_song;
    }

    public static void option_two(String[] songs) {
        String last_song = songs[songs.length - 1];
        for (int i = songs.length - 1; i > 0; i--) {
            songs[i] = songs[i - 1];
        }
        songs[0] = last_song;
    }

    public static void option_three(String[] songs) {
        String first_song = songs[0];
        songs[0] = songs[1];
        songs[1] = first_song;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        String[] songs = {"A", "B", "C", "D", "E"};

        while (true) {
            int b = in.nextInt();
            int n = in.nextInt();
            if (b == 1) {
                for (int i = 0; i < n; i++) {
                    option_one(songs);
                }
            } else if (b == 2) {
                for (int i = 0; i < n; i++) {
                    option_two(songs);
                }
            } else if (b == 3) {
                for (int i = 0; i < n; i++) {
                    option_three(songs);
                }
            } else {
                break;
            }
        }

        for (String i : songs) {
            System.out.println(i);
        }
    }
}