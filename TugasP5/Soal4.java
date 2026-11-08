package P5Loop.Tugas;


import java.util.Scanner;

public class Soal4 {
    final Scanner input = new Scanner(System.in);

    int n, angka, total;

    public void start() {
        System.out.println("=== Soal 4: Jumlah Bilangan Ganjil ===");

        System.out.print("Masukkan banyak angka: ");
        n = input.nextInt();

        angka = 1;
        total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(angka + " ");

            total += angka;
            angka += 2;
        }

        System.out.println();
        System.out.println("Total penjumlahan: " + total);
    }
}