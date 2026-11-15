package TugasP6;

import java.util.Scanner;

public class Soal6 {

    public void jalankan(Scanner input) {
        System.out.println("=== Soal 6: Rata-rata Bilangan ===");

        int n;

        try {
            System.out.print("Masukkan jumlah bilangan: ");
            n = input.nextInt();

            if (n <= 0) {
                System.out.println("Jumlah bilangan harus lebih dari 0.");
                return;
            }

        } catch (Exception e) {
            System.out.println("Input harus berupa angka.");
            input.nextLine();
            return;
        }

        double[] angka = new double[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            boolean valid = false;

            while (!valid) {
                try {
                    System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                    angka[i] = input.nextDouble();

                    total += angka[i];
                    valid = true;

                } catch (Exception e) {
                    System.out.println("Input salah! Masukkan angka kembali.");
                    input.nextLine();
                }
            }
        }

        double rataRata = total / n;

        System.out.println("\nJumlah seluruh bilangan: " + total);
        System.out.println("Rata-rata: " + rataRata);
    }
}