package TugasP3;

import java.io.*;

public class BufferedReaderInputStreamReader {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        Buah  b = new Buah();
        hitungBuah hit = new hitungBuah();
        
        System.out.print("Masukkan Jumlah Mangga\t: ");
        b.mangga = Integer.parseInt(input.readLine());
        
        System.out.print("Masukkan Jumlah Mangga Busuk\t: ");
        b.buosok = Integer.parseInt(input.readLine());
        
        System.out.print("Masukkan Jumlah Tetangga\t: ");
        b.tetangga = Integer.parseInt(input.readLine());
        
        System.out.print("Masukkan Jumlah Jambu per Tetangga\t: ");
        b.jambu = Integer.parseInt(input.readLine());
        
        b.output();
        hit.hitungBuah(b.mangga, b.buosok, b.tetangga, b.jambu);
    }
}

class Buah{
    int mangga, buosok, tetangga, jambu;
    
    public void output(){
        System.out.println("\nData Buah");
        System.out.println("Jumlah Mangga\t: " + mangga);
        System.out.println("Jumlah Mangga Busuk\t: " + buosok);
        System.out.println("Jumlah Tetangga\t: " + tetangga);
        System.out.println("Jambu per Tetangga\t: " + jambu);
    }
}

class hitungBuah{
    int manggaBaik, totJambu, totBuah;
    
    public void hitungBuah(int m, int b, int t, int j){
        manggaBaik = m - b;
        totJambu = t*j;
        totBuah = manggaBaik + totJambu;
        
        System.out.println("Mangga baik\t: " + manggaBaik);
        System.out.println("Total Jambu\t: " + totJambu);
        System.out.println("Total Buah\t: " + totBuah);
    }
}
