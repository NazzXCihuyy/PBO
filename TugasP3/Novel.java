
package TugasP3;

import java.util.Scanner;

public class Novel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataNovel N = new DataNovel();
        hitungCetak C = new hitungCetak();

        System.out.print("Masukkan Jumlah Novel: ");
        N.jumlahNovel = input.nextInt();

        System.out.print("Masukkan Jumlah Lembar per Novel: ");
        N.lembarNovel = input.nextInt();

        N.output();
        C.hitungWaktu(N.jumlahNovel, N.lembarNovel);

        input.close();
    }
}

class DataNovel {
    int jumlahNovel, lembarNovel;

    public void output() {
        System.out.println("\nData Pencetakan");
        System.out.println("Jumlah Novel: " + jumlahNovel);
        System.out.println("Lembar per Novel: " + lembarNovel);
    }
}

class hitungCetak {
    int totalLembar, totalDetik;
    int hari, jam, menit, detik;

    public void hitungWaktu(int novel, int lembar) {
        totalLembar = novel * lembar;
        totalDetik = totalLembar;

        hari = totalDetik / 86400;
        jam = (totalDetik % 86400) / 3600;
        menit = (totalDetik % 3600) / 60;
        detik = totalDetik % 60;

        System.out.println("Total Lembar: " + totalLembar);
        System.out.println("Waktu Pencetakan:");
        System.out.println("Hari: " + hari);
        System.out.println("Jam: " + jam);
        System.out.println("Menit: " + menit);
        System.out.println("Detik: " + detik);
    }
}
