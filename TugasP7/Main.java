package TugasP7;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\n===== TUGAS PRAKTIKUM =====");
            System.out.println("1. Class dan Object");
            System.out.println("2. Keliling Persegi Panjang");
            System.out.println("3. Menebak Tanggal Lahir");
            System.out.println("4. Sumpah Pemuda");
            System.out.println("5. Rekursif");
            System.out.println("6. Civitas Akademika");
            System.out.println("7. Keyword This");
            System.out.println("0. Keluar");

            System.out.print("Pilih soal: ");
             pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    new Soal1().jalankan();
                    break;

                case 2:
                    new Soal2().jalankan(input);
                    break;

                case 3:
                    new Soal3().jalankan(input);
                    break;

                case 4:
                    new Soal4().jalankan();
                    break;

                case 5:
                    new Soal5().jalankan(input);
                    break;

                case 6:
                    new Soal6().jalankan(input);
                    break;

                case 7:
                    new Soal7().jalankan(input);
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak tersedia.");
                    break;
            }
        }while(pilihan != 0);
    }
}
    

