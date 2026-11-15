package TugasP6;

public class Soal7 extends Thread {

    //Override
    public void run() {
        System.out.println("Thread sedang berjalan.");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Proses thread ke-" + i);
        }

        System.out.println("Thread selesai.");
    }

    public void jalankan() {
        System.out.println("=== Soal 7: Inheritance Thread ===");

        Soal7 thread = new Soal7();

        thread.start();
    }
}
