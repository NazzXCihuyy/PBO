package TugasP6;

public class Soal9 {

    public void jalankan() {
        System.out.println("=== Soal 9: Dua Macam Perulangan ===");

        int[] age = {12, 4, 5, 2, 6};

        System.out.println("Menggunakan for:");

        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

        System.out.println("\nMenggunakan foreach:");

        for (int nilai : age) {
            System.out.println(nilai);
        }
    }
}
