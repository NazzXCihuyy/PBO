package TugasP6;

import java.util.Scanner;

public class Soal5 {

    public void jalankan(Scanner input) {
        System.out.println("=== Soal 5: Penjumlahan Matriks ===");

        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();

        if (baris <= 0 || kolom <= 0) {
            System.out.println("Baris dan kolom harus lebih dari 0.");
            return;
        }

        int[][] A = new int[baris][kolom];
        int[][] B = new int[baris][kolom];
        int[][] C = new int[baris][kolom];

        System.out.println("\nMasukkan elemen matriks A:");

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = input.nextInt();
            }
        }

        System.out.println("\nMasukkan elemen matriks B:");

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("\nHasil Penjumlahan Matriks:");

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(C[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
