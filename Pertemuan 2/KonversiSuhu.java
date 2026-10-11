package Praktikum;


public class KonversiSuhu {
      public static void main(String[] args) {
        hitungSuhu hs = new hitungSuhu();
        hs.C = 10;
        hs.F = 15;
        hs.R = 5;
        
        //A
        System.out.println("Celsius ke Fahrenheit: " + hs.CtoF());
        System.out.println("Fahrenheit ke Celsius: " + hs.FtoC());
        //B
        System.out.println("Celsius ke Reamur: " + hs.CtoR());
        System.out.println("Reamur ke Celsius: " + hs.RtoC());
        //C
        System.out.println("Fahrenheit ke Reamur: " + hs.FtoR());
        System.out.println("Reamur ke Fahrenheit: " + hs.RtoF());
    }
}

class hitungSuhu {
    double C;
    double F;
    double R;

    double CtoF() {
        return C * 9 / 5 + 32;
    }

    double FtoC() {
        return (F - 32) * 5 / 9;
    }

    double CtoR() {
        return C * 4 / 5;
    }

    double RtoC() {
        return R * 5 / 4;
    }

    double FtoR() {
        return (F - 32) * 4 / 9;
    }

    double RtoF() {
        return R * 9 / 4 + 32;
    }
}