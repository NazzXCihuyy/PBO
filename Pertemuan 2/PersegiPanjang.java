
package Praktikum;


public class PersegiPanjang {
    public static void main(String[] args) {
        hitungLuas pp = new hitungLuas();
        pp.panjang = 50;
        pp.lebar = 45;

        System.out.println("Luas persegi panjang: " + pp.hitung());
    }
}

class hitungLuas {
    int panjang;
    int lebar;
    int luas;

    int hitung() {
        luas = panjang * lebar;
        return luas;
    }
}