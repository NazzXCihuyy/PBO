package TugasP6;

import java.util.ArrayList;

public class Soal10 {

    public void jalankan() {
        System.out.println("=== Soal 10: ArrayList Berbagai Tipe Data ===");

        ArrayList<Object> data = new ArrayList<>();

        data.add(19);
        data.add(0.2);
        data.add('C');
        data.add("Java");
        data.add(true);

        for (Object nilai : data) {
            System.out.println(nilai);
        }
    }
}
