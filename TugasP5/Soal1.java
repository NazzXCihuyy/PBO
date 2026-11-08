package P5Loop.Tugas;

import java.util.Scanner;

public class Soal1 {
    final Scanner input = new Scanner(System.in);

    int bil, terbesar, terkecil;

    public void start() {
        System.out.println("=== Soal 1: Terbesar dan Terkecil ===");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            bil = input.nextInt();

            if (i == 1) {
                terbesar = bil;
                terkecil = bil;
            } else {
                if (bil > terbesar) {
                    terbesar = bil;
                }

                if (bil < terkecil) {
                    terkecil = bil;
                }
            }
        }

        System.out.println("Bilangan terbesar: " + terbesar);
        System.out.println("Bilangan terkecil: " + terkecil);
    }
}
