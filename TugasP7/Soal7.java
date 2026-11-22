package TugasP7;

import java.util.Scanner;

class DataMahasiswa{
    private String nama, npm, kelas;
    
    DataMahasiswa(String nama, String npm, String kelas){
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }
    
    public void tampilData(){
        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("Nama\t: " + nama);
        System.out.println("NPM\t: " + npm);
        System.out.println("Kelas\t: " + kelas);
    }
}

public class Soal7 {
    String nama, npm, kelas;
    void jalankan(Scanner input){
        System.out.println("=== Soal 7: Keyword This ===");
        
        input.nextLine();
        
        System.out.print("Masukkan nama\t: ");
        nama = input.nextLine();
        
        System.out.print("Masukkan npm\t: ");
         npm = input.nextLine();
        
        System.out.print("Masukkan kelas\t: ");
        kelas = input.nextLine();
        
        DataMahasiswa mhs1 = new DataMahasiswa(nama, npm, kelas);
        
        mhs1.tampilData();
    }

  
}
