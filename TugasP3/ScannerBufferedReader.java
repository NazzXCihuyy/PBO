package TugasP3;

import java.util.Scanner;
import java.io.*;


//Scanner memiliki metode seperti nextInt() untuk membaca angka,
//sedangkan BufferedReader ngebaca teks menggunakan readLine(),
//jadi input angka perlu dikonversi.

public class ScannerBufferedReader {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama (Scanner): ");
        String nama1 = sc.nextLine();

        System.out.print("Masukkan umur (Scanner): ");
        int umur1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Nama: " + nama1);
        System.out.println("Umur: " + umur1);

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Masukkan nama (BufferedReader): ");
        String nama2 = br.readLine();

        System.out.print("Masukkan umur (BufferedReader): ");
        int umur2 = Integer.parseInt(br.readLine());

        System.out.println("Nama: " + nama2);
        System.out.println("Umur: " + umur2);
    
    }
}
