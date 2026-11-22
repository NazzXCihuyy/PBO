package TugasP7;

import java.util.Scanner;

public class Soal5 {
    
    public long faktorial(int angka){
        if(angka == 0 || angka == 1){
            return 1;
        }
        return angka * faktorial(angka-1);
    }
    
    public void jalankan(Scanner input){
        System.out.println("=== Soal 5: Rekursif ===");
        
        System.out.print("Masukkan angka\t: ");
        int angka = input.nextInt();
        
        if(angka < 0 || angka > 20){
            System.out.println("Masukkan angka > 0  dan < 20");
        }else{
            System.out.println("Hasil faktorial\t: " + faktorial(angka));
        }
    }
}
