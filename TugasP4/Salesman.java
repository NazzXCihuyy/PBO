
package P5;

import java.util.Scanner;

public class Salesman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan pendapatan penjualan: Rp");
        double penjualan = input.nextDouble();

        double gajiPokok, bonus, totalGaji;

        if (penjualan <= 2000000) {
            gajiPokok = 100000;
            bonus = penjualan * 0.10;
        } else if (penjualan <= 5000000) {
            gajiPokok = 200000;
            bonus = penjualan * 0.15;
        } else {
            gajiPokok = 300000;
            bonus = penjualan * 0.20;
        }

        totalGaji = gajiPokok + bonus;

        System.out.println("Pendapatan Penjualan: Rp" + penjualan);
        System.out.println("Gaji Pokok: Rp" + gajiPokok);
        System.out.println("Bonus: Rp" + bonus);
        System.out.println("Total Gaji: Rp" + totalGaji);

    }
}
