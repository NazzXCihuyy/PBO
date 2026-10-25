
package P5;

import java.util.Scanner;

public class Kubik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();

        int kubik = bilangan * bilangan * bilangan;

        System.out.println("Bilangan kubik: " + kubik);

    }
}
