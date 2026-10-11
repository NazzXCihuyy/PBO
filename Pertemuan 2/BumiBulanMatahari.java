package Praktikum;


public class BumiBulanMatahari {
    public static void main(String[] args) {
     hitungWaktu wt = new hitungWaktu();
        wt.jarakBulan = 384400;
        wt.jarakMatahari = 152100000;
        wt.kecepatan = 300000;

        System.out.println("Waktu ke bulan: " + wt.bulan() + " detik");
        System.out.println("Waktu ke matahari: " + wt.matahari() + " detik");
    }
}

class hitungWaktu {
    double jarakBulan;
    double jarakMatahari;
    double kecepatan;

    double bulan() {
        return jarakBulan / kecepatan;
    }

    double matahari() {
        return jarakMatahari / kecepatan;
    }
}