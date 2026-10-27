package P5;
import java.util.Scanner;
public class Kasir {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Apakah Meiliki Kartu Member? (ya/tidak): ");
        String stat = s.nextLine();
        
        System.out.println("Masukkan Total Belanja\t: ");
        int tobel = s.nextInt();
        
        int diskon = 0;
        
        if( stat.equalsIgnoreCase("ya")){
            if(tobel > 500000){
                diskon = 50000;
            }else if(tobel > 100000){
                diskon = 10000;
            }else{
                System.out.println("Ga Dapet Diskon");
            }
        }else if(stat.equalsIgnoreCase("tidak")){
            if(tobel > 100000){
                diskon = 10000;
            }else{
                System.out.println("Ga Dapet Diskon");
            }
        }else{
            System.out.println("Tidak Valid");
        }
        
        tobel -= diskon;
        System.out.println("Diskon\t: " + diskon);
        System.out.println("Total Belanja\t: " + tobel);
        System.out.println("Status Member\t: " + stat);
    }
}
