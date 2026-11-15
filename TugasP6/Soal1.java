package TugasP6;

import java.util.Scanner;

public class Soal1 {

    public void jalankan(Scanner input) {
        System.out.println("=== Soal 1: Tiga Variasi Array Integer ===");

        int[] angka1 = new int[3];
        angka1[0] = 3;
        angka1[1] = 1;
        angka1[2] = 55;

        int[] angka2 = {10, 20, 30, 40, 50};

        int angka3[] = new int[]{1, 2, 3, 4, 5};

        System.out.println("Array pertama:");

        for (int i = 0; i < angka1.length; i++) {
            System.out.print(angka1[i] + " ");
        }

        System.out.println("\nArray kedua:");

        for (int nilai : angka2) {
            System.out.print(nilai + " ");
        }

        System.out.println("\nArray ketiga:");

        for (int nilai : angka3) {
            System.out.print(nilai + " ");
        }

        System.out.println();
    }
}
