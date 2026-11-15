package TugasP6;

import java.util.Scanner;

public class Soal8 {

    class AnakThread extends Thread {

        public AnakThread(String nama) {
            super(nama);
        }

        public void run() {
            System.out.println("Thread berjalan: " + getName());
        }
    }

    public void jalankan(Scanner input) {
        System.out.println("=== Soal 8: Membuat Banyak Thread ===");

        System.out.print("Masukkan jumlah thread: ");
        int jumlah = input.nextInt();

        if (jumlah <= 0) {
            System.out.println("Jumlah thread harus lebih dari 0.");
            return;
        }

        for (int i = 1; i <= jumlah; i++) {
            AnakThread thread = new AnakThread("Thread-" + i);
            thread.start();
        }
    }
}
