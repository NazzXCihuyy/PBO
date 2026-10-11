
package Praktikum;

public class PersamaanKuadrat {
    public static void main(String[] args) {
        hitungPersamaan pk = new hitungPersamaan();
        pk.a = 2;
        pk.b = 10;
        pk.c = 5;

        System.out.println("Hasil persamaan kuadrat: " + pk.hitung());
    }
}

class hitungPersamaan {
    int a;
    int b;
    int c;
    int hasil;

    int hitung() {
        hasil = b * b - 4 * a * c;
        return hasil;
    }
}