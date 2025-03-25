package Modul_9;

import java.util.Scanner;

public class OddNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        int start = scanner.nextInt();

        System.out.print("Masukkan batas akhir: ");
        int end = scanner.nextInt();

        System.out.println("Bilangan ganjil antara " + start + " dan " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
