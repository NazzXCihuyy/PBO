package P5;

import java.util.Scanner;
public class Kabisat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukkan Tahun\t: ");
        int tahun = s.nextInt();
        
        if(tahun %4 == 0 && tahun % 100 != 1 || (tahun %400 == 0)){
            System.out.println(tahun + " Adalah Tahun Kabisat");
        }else{
            System.out.println(tahun + " Bukan Tahun Kabisat");
        }
    }
}
