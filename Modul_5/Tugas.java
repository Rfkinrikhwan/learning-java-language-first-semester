package Modul_5;

import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c, d;

        System.out.print("Masukkan Nilai a: ");
        a = scanner.nextInt();

        System.out.print("Masukkan Nilai b: ");
        b = scanner.nextInt();

        System.out.print("Masukkan Nilai c: ");
        c = scanner.nextInt();

        d = b * b - (4 * a * c);

        System.out.println("Determinan: " + d);

        if (d > 0) {
            System.out.println("D > 0: akar beda");
        } else if (d == 0) {
            System.out.println("D = 0: akar kembar");
        } else {
            System.out.println("D < 0: akar imajiner");
        }

        scanner.close();
    }
}
