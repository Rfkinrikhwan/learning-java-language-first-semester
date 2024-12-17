package Modul_13;

import java.util.Scanner;

public class Tugas {
    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        float nilai[] = new float[5];
        float jumlah = 0, rataRata, terbesar, terkecil;

        System.out.println("Masukkan 5 buah data nilai");
        for (int i = 0; i < 5; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            nilai[i] = masuk.nextFloat();
            jumlah += nilai[i]; // Menjumlahkan nilai
        }

        // Inisialisasi nilai terbesar dan terkecil dengan nilai pertama
        terbesar = terkecil = nilai[0];

        // Mencari nilai terbesar dan terkecil
        for (int i = 1; i < 5; i++) {
            if (nilai[i] > terbesar) {
                terbesar = nilai[i];
            }
            if (nilai[i] < terkecil) {
                terkecil = nilai[i];
            }
        }

        // Menghitung rata-rata
        rataRata = jumlah / nilai.length;

        // Menampilkan hasil
        System.out.println("\nData nilai yang dimasukkan:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Data ke-" + (i + 1) + ": " + nilai[i]);
        }

        System.out.println("\nHasil Perhitungan:");
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Rata-rata: " + rataRata);
        System.out.println("Nilai terbesar: " + terbesar);
        System.out.println("Nilai terkecil: " + terkecil);
    }
}
