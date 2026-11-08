package P5Loop.Tugas;



import java.util.Scanner;

public class Soal3 {
    final Scanner input = new Scanner(System.in);

    int baris;

    public void start() {
        System.out.println("=== Soal 3: Floyd's Triangle ===");

        System.out.print("Masukkan banyak baris: ");
        baris = input.nextInt();

        int angka = 1;

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(angka + " ");
                angka++;
            }

            System.out.println();
        }
    }
}
