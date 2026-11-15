package TugasP6;

import java.util.Scanner;

public class Soal3 {

    public void jalankan(Scanner input) {
        System.out.println("=== Soal 3: Operasi Array ===");

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Jumlah elemen harus lebih dari 0.");
            return;
        }

        int[] angka = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + i + ": ");
            angka[i] = input.nextInt();
        }

        int terbesar = angka[0];
        int terkecil = angka[0];
        int indeksTerbesar = 0;
        int indeksTerkecil = 0;
        int total = 0;
        int jumlahGanjil = 0;
        int jumlahGenap = 0;

        for (int i = 0; i < n; i++) {
            total += angka[i];

            if (angka[i] > terbesar) {
                terbesar = angka[i];
                indeksTerbesar = i;
            }

            if (angka[i] < terkecil) {
                terkecil = angka[i];
                indeksTerkecil = i;
            }

            if (i % 2 == 0) {
                jumlahGenap += angka[i];
            } else {
                jumlahGanjil += angka[i];
            }
        }

        double rataRata = (double) total / n;

        System.out.println("\nNilai terbesar: " + terbesar);
        System.out.println("Indeks terbesar: " + indeksTerbesar);

        System.out.println("Nilai terkecil: " + terkecil);
        System.out.println("Indeks terkecil: " + indeksTerkecil);

        System.out.println("Jumlah seluruh elemen: " + total);
        System.out.println("Rata-rata: " + rataRata);

        System.out.println("Jumlah indeks genap: " + jumlahGenap);
        System.out.println("Jumlah indeks ganjil: " + jumlahGanjil);

        if (jumlahGenap % 2 == 0) {
            System.out.println("Hasil penjumlahan indeks genap: GENAP");
        } else {
            System.out.println("Hasil penjumlahan indeks genap: GANJIL");
        }

        if (jumlahGanjil % 2 == 0) {
            System.out.println("Hasil penjumlahan indeks ganjil: GENAP");
        } else {
            System.out.println("Hasil penjumlahan indeks ganjil: GANJIL");
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (angka[j] > angka[j + 1]) {
                    int sementara = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1] = sementara;
                }
            }
        }

        System.out.println("Array setelah diurutkan:");

        for (int nilai : angka) {
            System.out.print(nilai + " ");
        }

        System.out.println();
    }
}
