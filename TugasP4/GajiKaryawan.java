
package P5;

import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataKaryawan K = new DataKaryawan();
        Penggajian G = new Penggajian();

        System.out.print("Masukkan NIK: ");
        K.NIK = input.nextLine();

        System.out.print("Masukkan Nama: ");
        K.nama = input.nextLine();

        System.out.print("Masukkan Kode Golongan (1-4): ");
        K.golongan = input.nextInt();
        input.nextLine();

        System.out.print("Status Menikah (ya/tidak): ");
        K.status = input.nextLine();

        System.out.print("Jumlah Anak: ");
        K.jumlahAnak = input.nextInt();

        G.hitungGaji(K.golongan, K.status, K.jumlahAnak);
        K.output();
        G.output();

    }
}

class DataKaryawan {
    String NIK, nama, status;
    int golongan, jumlahAnak;

    public void output() {
        System.out.println("\nData Karyawan");
        System.out.println("NIK: " + NIK);
        System.out.println("Nama: " + nama);
        System.out.println("Golongan: " + golongan);
        System.out.println("Status: " + status);
        System.out.println("Jumlah Anak: " + jumlahAnak);
    }
}

class Penggajian {
    double gajiPokok, tunjanganPasangan;
    double tunjanganAnak, totalGaji;

    public void hitungGaji(int golongan, String status, int anak) {
        if (golongan == 1) {
            gajiPokok = 1200000;
        } else if (golongan == 2) {
            gajiPokok = 1500000;
        } else if (golongan == 3) {
            gajiPokok = 1750000;
        } else if (golongan == 4) {
            gajiPokok = 2000000;
        } else {
            gajiPokok = 0;
        }

        if (status.equalsIgnoreCase("ya")) {
            tunjanganPasangan = gajiPokok * 0.10;
        } else {
            tunjanganPasangan = 0;
        }

        tunjanganAnak = gajiPokok * 0.05 * anak;
        totalGaji = gajiPokok + tunjanganPasangan + tunjanganAnak;
    }

    public void output() {
        System.out.println("\nRincian Gaji");
        System.out.println("Gaji Pokok: Rp" + gajiPokok);
        System.out.println("Tunjangan Pasangan: Rp" + tunjanganPasangan);
        System.out.println("Tunjangan Anak: Rp" + tunjanganAnak);
        System.out.println("Gaji Bersih: Rp" + totalGaji);
    }
}
