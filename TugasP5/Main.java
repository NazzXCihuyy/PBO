package P5Loop.Tugas;




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean cek = true;

        Soal1 s1 = new Soal1();
        Soal2 s2 = new Soal2();
        Soal3 s3 = new Soal3();
        Soal4 s4 = new Soal4();
        Soal5 s5 = new Soal5();
        Soal6 s6 = new Soal6();
        Soal7 s7 = new Soal7();
        Soal8 s8 = new Soal8();

        do {
            
            System.out.println("\tPERULANGAN");
            System.out.println("====================================");
            System.out.println("1. Bilangan terbesar dan terkecil");
            System.out.println("2. Jumlah dan rata-rata bilangan");
            System.out.println("3. Floyd's Triangle");
            System.out.println("4. Jumlah bilangan ganjil");
            System.out.println("5. Half Triangle dan Full Triangle");
            System.out.println("6. Menampilkan angka sebelas dua kali");
            System.out.println("7. Perbedaan i++ dan ++i");
            System.out.println("8. Perulangan foreach");
            System.out.println("0. Keluar");
            System.out.print("Pilih soal (0-8): ");

            String pil = input.nextLine();

            System.out.println();

            switch (pil) {
                case "1" -> s1.start();
                case "2" -> s2.start();
                case "3" -> s3.start();
                case "4" -> s4.start();
                case "5" -> s5.start();
                case "6" -> s6.start();
                case "7" -> s7.start();
                case "8" -> s8.start();
                case "0" -> cek = false;
                default -> System.out.println("Pilihan tidak valid.");
            }

            System.out.println();

        } while (cek);

        System.out.println("Program selesai.");
    }
}
