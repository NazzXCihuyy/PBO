package TugasP3;

import java.util.Scanner;

public class Gaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        dataKaryawan K = new dataKaryawan();
        Penggajian gaji = new Penggajian();
        
        System.out.print("Masukkan NIK Anda\t: ");
        K.NIK = input.nextLine();
        System.out.print("Masukkan Nama Anda\t: ");
        K.nama = input.nextLine();
        System.out.print("Masukkan Alamat Anda\t: ");
        K.alamat = input.nextLine();
        System.out.print("Masukkan Jabatan Anda\t: ");
        K.jabatan = input.nextLine();
        System.out.print("Masukkan Gaji Pokok\t: ");
        gaji.p1 = input.nextDouble();
        System.out.print("Masukkan Tunjangan Jabatan\t: ");
        gaji.p2 = input.nextDouble();
        System.out.print("Masukkan Tunjangan Istri\t: ");
        gaji.p3 = input.nextDouble();
        System.out.print("Masukkan Tunjangan Anak\t\t: ");
        gaji.p4 = input.nextDouble();
        
        K.output();
        gaji.hitungGaji();
    }
 
}

class dataKaryawan{
    String NIK, nama, alamat, jabatan;
    
    public void output(){
        System.out.println("Nomor Induk Karyawan\t: " + NIK);
        System.out.println("Nama Karyawan\t\t: " + nama);
        System.out.println("Alamat\t\t\t: " + alamat);
        System.out.println("Jabatan\t\t\t: " + jabatan);
    }
}

class Penggajian{
    double p1, p2, p3, p4, TG, Pajak, GB;
    
    public void hitungGaji(){
        TG = p1 + p2 + p3 + p4;
        Pajak = 0.10 * (p1+p2+p4);
        GB = TG - Pajak;
        
        System.out.println("Gaji Pokok\t\t: " + p1);
        System.out.println("Tunjangan Jabatan\t: " + p2);
        System.out.println("Tunjangan Istri\t\t: " + p3);
        System.out.println("Tunjangan Anak\t\t: " + p4);
        System.out.println("Total Gaji\t\t: " + TG);
        System.out.println("Pajak Penghasilan\t: " + Pajak);
        System.out.println("Gaji Bersih\t\t: " + GB);
    }
}
