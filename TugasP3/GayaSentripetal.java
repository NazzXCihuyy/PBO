package TugasP3;

import java.util.Scanner;

public class GayaSentripetal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        dataBenda B = new dataBenda();
        Perhitungan G = new Perhitungan();
        
        System.out.print("Masukkan Massa Benda (M)\t: ");
        B.M = input.nextDouble();
        System.out.print("Masukkan Kecepatan Benda (v)\t: ");
        B.v = input.nextDouble();
        System.out.print("Masukkan Jari-jari Benda (r)\t: ");
        B.r = input.nextDouble();
        
        B.output();
        G.hitungan(B.M, B.v, B.r);
        
    }
}

class dataBenda{
    double M, v, r;
    public void output(){
        System.out.println("\n-Data Benda-");
        System.out.println("Massa Benda (M)\t: " + M + " kg" );
        System.out.println("Kecepatan Benda (v)\t: " + v + " m/s");
        System.out.println("Jari-jari lintasan (r)\t: " + r + " m");
    }
}

class Perhitungan{
    double Fc;
    
    public void hitungan(double M, double v, double r){
        Fc = (M * v * v) / r;
        System.out.println("Gaya Sentripetal Fc\t: " + Fc + " N");
    }
}