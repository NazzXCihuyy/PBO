package Praktikum;


public class MengubahString {
    public static void main(String[] args) {
        prosesString ps = new prosesString();
        ps.a = "Saya Belajar Java";
        ps.b = "Saya Belajar JAVA";

        System.out.println(ps.hurufKecil());
        System.out.println(ps.hurufBesar());
    }
}

class prosesString {
    String a;
    String b;

    String hurufKecil() {
        return a.toLowerCase();
    }

    String hurufBesar() {
        return b.toUpperCase();
    }
}