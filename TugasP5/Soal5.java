package P5Loop.Tugas;


import java.util.Scanner;

public class Soal5 {
    final Scanner input = new Scanner(System.in);

    int baris;

    public void start() {
        System.out.println("=== Soal 5: Half Triangle dan Full Triangle ===");

        System.out.print("Masukkan banyak baris: ");
        baris = input.nextInt();

        System.out.println("\nHalf Triangle");

        for (int i = 1; i <= baris; i++) {
            for (int j = baris; j>i; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nFull Triangle");

    int tengah = (baris + 1) / 2;

       for (int i = 1; i <= tengah; i++) {
        for (int j = 1; j <= tengah - i; j++) {
            System.out.print(" ");
        }

        for (int j = 1; j <= (2 * i - 1); j++) {
            System.out.print("*");
        }

            System.out.println();
       }

       for (int i = tengah - 1; i >= 1; i--) {
        for (int j = 1; j <= tengah - i; j++) {
            System.out.print(" ");
        }

        for (int j = 1; j <= (2 * i - 1); j++) {
            System.out.print("*");
        }

        System.out.println();
       }
    }
}
