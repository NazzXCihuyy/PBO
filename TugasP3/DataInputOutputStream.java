package TugasP3;

import java.io.*;

public class DataInputOutputStream {
    public static void main(String[] args) throws IOException {
        DataInputStream input = new DataInputStream(System.in);
        
        System.out.print("Nama\t\t: ");
        String nama = input.readLine();
        
        System.out.print("Total Belanja\t: ");
        double tb = Double.parseDouble(input.readLine());
        
        System.out.print("Diskon (%)\t: ");
        double persen = Double.parseDouble(input.readLine());
        
        double diskon = tb * (persen / 100);
        double total = tb - diskon;
        
        System.out.print("Bayar\t\t: ");
        double bayar = Double.parseDouble(input.readLine());
        
        double kembalian = bayar - total;
        
        System.out.println("\nNama\t\t: "+nama);
        System.out.println("Total Belanja\t: " + tb);
        System.out.println("Diskon ( " + persen + " %): " + diskon);
        System.out.println("Total\t\t: " + total);
        System.out.println("Bayar\t\t: " + bayar);
        System.out.println("Kembalian\t: " + kembalian);
        
        
    }
    
}
