
package Praktikum;

public class Segitiga {
    public static void main(String[] args) {
        hitungSegitiga sg = new hitungSegitiga();
        sg.a = 6;
        sg.b = 8;

        System.out.println("Luas segitiga: " + sg.hitungLuas());
        
        //No.6
        System.out.println("Nilai c: " + sg.hitungC());
        System.out.println("Keliling segitiga: " + sg.hitungKeliling());
    }
}

class hitungSegitiga {
    double a;
    double b;
    double c;
    double luas;

    double hitungLuas() {
        luas = 0.5 * a * b;
        return luas;
    }
    
    //No.6 Phytagoras
    double hitungC() {
        c = Math.sqrt(a * a + b * b);
        return c;
    }

    double hitungKeliling() {
        return a + b + hitungC();
    }
}