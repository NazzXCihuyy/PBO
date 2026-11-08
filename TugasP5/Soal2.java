package P5Loop.Tugas;

import java.util.Scanner;

public class Soal2 {
    final Scanner input = new Scanner(System.in);

    int n, bil, total;
    double rataRata;

    public void start() {
        System.out.println("=== Soal 2: Jumlah dan Rata-rata ===");

        System.out.print("Masukkan banyak bilangan: ");
        n = input.nextInt();

        total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            bil = input.nextInt();

            total += bil;
        }

        if (n > 0) {
            rataRata = (double) total / n;

            System.out.println("Jumlah bilangan: " + total);
            System.out.println("Rata-rata: " + rataRata);
        } else {
            System.out.println("Banyak bilangan harus lebih dari 0.");
        }
    }
}
