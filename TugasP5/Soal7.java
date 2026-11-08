package P5Loop.Tugas;


public class Soal7 {
    int i;

    public void start() {
        System.out.println("=== Soal 7: Perbedaan i++ dan ++i ===");

        System.out.println("Perulangan menggunakan i++:");

        i = 0;

        while (i < 5) {
            System.out.println(i++);
        }

        System.out.println("\nPerulangan menggunakan ++i:");

        i = 0;

        while (i < 5) {
            System.out.println(++i);
        }
    }
}
