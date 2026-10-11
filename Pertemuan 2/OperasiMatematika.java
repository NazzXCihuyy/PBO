package Praktikum;


public class OperasiMatematika {
    public static void main(String[] args) {
        hitungOperasi op = new hitungOperasi();
        op.x = 22;
        op.y = 33;

        System.out.println("Penjumlahan: " + op.tambah());
        System.out.println("Pengurangan: " + op.kurang());
        System.out.println("Perkalian: " + op.kali());
        System.out.println("Pembagian: " + op.bagi());
    }
}

class hitungOperasi {
    int x;
    int y;

    int tambah() {
        return x + y;
    }

    int kurang() {
        return x - y;
    }

    int kali() {
        return x * y;
    }

    double bagi() {
        return (double) x / y;
    }
}