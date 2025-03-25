package Modul_3;

import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input bilangan dari keyboard
        System.out.print("Bilangan 1 : ");
        int bilangan1 = input.nextInt();
        System.out.print("Bilangan 2 : ");
        int bilangan2 = input.nextInt();

        // Proses perhitungan dengan operator aritmatika
        int jumlah = bilangan1 + bilangan2; // Penjumlahan
        int kurang = bilangan1 - bilangan2; // Pengurangan
        int kali = bilangan1 * bilangan2; // Perkalian
        int bagi = bilangan1 / bilangan2; // Pembagian
        int sisa = bilangan1 % bilangan2; // Sisa pembagian

        // Output hasil perhitungan
        System.out.println("\nHasil Operator Aritmatika");
        System.out.println("=========================");
        System.out.println("Jumlah = " + jumlah);
        System.out.println("Kurang = " + kurang);
        System.out.println("Kali   = " + kali);
        System.out.println("Bagi   = " + bagi);
        System.out.println("Sisa   = " + sisa);
    }
}
