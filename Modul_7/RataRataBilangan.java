package Modul_7;

import java.util.Scanner;

public class RataRataBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta jumlah data
        System.out.print("Banyaknya data: ");
        int n = scanner.nextInt();

        double total = 0;
        int i = 1;

        // Menggunakan perulangan while untuk memasukkan data
        while (i <= n) {
            System.out.print("Data ke-" + i + ": ");
            double data = scanner.nextDouble();
            total += data;
            i++;
        }

        // Menghitung rata-rata
        double rataRata = total / n;

        // Menampilkan hasil
        System.out.println("Rata-rata: " + rataRata);
        System.out.println("Jumlah: " + total);

        scanner.close();
    }
}
