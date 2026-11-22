package TugasP7;

import java.util.Scanner;

public class Soal3 {
    
    public void tebakTanggal(int hasilAkhir){
        int bulan = hasilAkhir / 100;
        int tanggal = hasilAkhir % 100;
        
        if(bulan < 1 || bulan > 12 || tanggal < 1 || tanggal > 31){
            System.out.println("Hasil Perhitungan tidka valid!");
        }else{
            System.out.println("Hasil Akhir\t: " + hasilAkhir);
            System.out.println("Bulan Lahir\t: " + bulan);
            System.out.println("Tanggal Lahir\t: " + tanggal);
            
        }
    }
    
    public void jalankan(Scanner input){
        System.out.println("=== Soal 3: Menebak Tanggal Lahir ===");
        System.out.println("");
        System.out.println("Lakukan perhitungan berikut : ");
        System.out.println("1. Kalikan angka bulan lahir dengan 2");
        System.out.println("2. Tambahkan hasilnya dengan 5");
        System.out.println("3. Kalikan hasilnya dengan 50");
        System.out.println("4. Tambahkan dengan tanggal lahir");
        System.out.println("5. Kurangi hasilnya dengan 250");
        
        System.out.print("Masukkan hasil akhir\t: ");
        int hasil = input.nextInt();
                
        input.nextLine();
                
        tebakTanggal(hasil);
    }
}
