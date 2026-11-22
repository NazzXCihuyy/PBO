package TugasP7;

import java.util.Scanner;

public class Soal2 {
    
    public double hitungK(double panjang, double lebar){
        return 2*(panjang+lebar);
    }
    
    public void jalankan(Scanner input){
        System.out.println("=== Soal2: keliling Persegi Panjang ===");
        
        System.out.print("Masukkan Panjang\t: ");
        double panjang = input.nextDouble();
        
        System.out.print("Masukkan Lebar\t: ");
        double lebar = input.nextDouble();
        
        input.nextLine();
        
        double keliling = hitungK(panjang,lebar);
        
        System.out.println("Keliling persegi panjang\t: " + keliling);
    }
}
