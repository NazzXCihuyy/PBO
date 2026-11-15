package TugasP6;


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
        Soal9 s9 = new Soal9();
        Soal10 s10 = new Soal10();

        do {
            System.out.println("==============================================");
            System.out.println("  ARRAY, EXCEPTION HANDLING DAN MULTITHREADING");
            System.out.println("==============================================");
            System.out.println("1. Tiga Variasi Array Integer");
            System.out.println("2. Mengubah Nilai Array");
            System.out.println("3. Operasi Array");
            System.out.println("4. Daftar Nilai Mahasiswa");
            System.out.println("5. Penjumlahan Matriks");
            System.out.println("6. Rata-rata Sekelompok Bilangan");
            System.out.println("7. Inheritance Thread");
            System.out.println("8. Membuat Banyak Thread");
            System.out.println("9. Dua Macam Perulangan Array");
            System.out.println("10. Array dengan Berbagai Tipe Data");
            System.out.println("0. Keluar");
            System.out.println("----------------------------------------------");
            System.out.print("Pilih soal (1-10): ");

            int pil = input.nextInt();

            System.out.println();

            switch (pil) {
                case 1 -> s1.jalankan(input);
                case 2 -> s2.jalankan();
                case 3 -> s3.jalankan(input);
                case 4 -> s4.jalankan(input);
                case 5 -> s5.jalankan(input);
                case 6 -> s6.jalankan(input);
                case 7 -> s7.jalankan();
                case 8 -> s8.jalankan(input);
                case 9 -> s9.jalankan();
                case 10 -> s10.jalankan();
                case 0 -> cek = false;
                default -> System.out.println("Pilihan tidak valid.");
            }

            System.out.println();

        } while (cek);

        System.out.println("Program selesai.");
        input.close();
    }
}
