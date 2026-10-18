package TugasP3;

import java.util.Scanner;

public class Waktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataWaktu W = new DataWaktu();
        PerhitunganWaktu S = new PerhitunganWaktu();

        System.out.println("-Waktu Pertama");
        System.out.print("Jam: ");
        W.jam1 = input.nextInt();
        System.out.print("Menit: ");
        W.menit1 = input.nextInt();
        System.out.print("Detik: ");
        W.detik1 = input.nextInt();

        System.out.println("\n-Waktu Kedua");
        System.out.print("Jam: ");
        W.jam2 = input.nextInt();
        System.out.print("Menit: ");
        W.menit2 = input.nextInt();
        System.out.print("Detik: ");
        W.detik2 = input.nextInt();

        W.output();
        S.hitungSelisih(W.jam1, W.menit1, W.detik1,
                        W.jam2, W.menit2, W.detik2);

        input.close();
    }
}

class DataWaktu {
    int jam1, menit1, detik1;
    int jam2, menit2, detik2;

    public void output() {
        System.out.println("\nWaktu Pertama: "
                + jam1 + ":" + menit1 + ":" + detik1);
        System.out.println("Waktu Kedua: "
                + jam2 + ":" + menit2 + ":" + detik2);
    }
}

class PerhitunganWaktu {
    int waktu1, waktu2, selisih;
    int jam, menit, detik;

    public void hitungSelisih(int j1, int m1, int d1,
                              int j2, int m2, int d2) {
        waktu1 = j1 * 3600 + m1 * 60 + d1;
        waktu2 = j2 * 3600 + m2 * 60 + d2;

        selisih = Math.abs(waktu1 - waktu2);

        jam = selisih / 3600;
        menit = (selisih % 3600) / 60;
        detik = selisih % 60;

        System.out.println("Selisih Waktu: "
                + jam + " jam, "
                + menit + " menit, "
                + detik + " detik");
    }
}

