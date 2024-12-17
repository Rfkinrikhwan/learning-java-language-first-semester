package Modul_14;

import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi array 2 dimensi: [10 baris][3 kolom]
        String[][] mahasiswa = new String[10][3];

        System.out.println("Masukkan 10 data mahasiswa (NIM, Nama, Jurusan):");

        // Input data mahasiswa
        for (int i = 0; i < 10; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("NIM     : ");
            mahasiswa[i][0] = input.nextLine(); // Kolom 0 untuk NIM
            System.out.print("Nama    : ");
            mahasiswa[i][1] = input.nextLine(); // Kolom 1 untuk Nama
            System.out.print("Jurusan : ");
            mahasiswa[i][2] = input.nextLine(); // Kolom 2 untuk Jurusan
        }

        // Menampilkan data mahasiswa
        System.out.println("\nData Mahasiswa yang Telah Dimasukkan:");
        System.out.printf("%-15s %-20s %-15s\n", "NIM", "Nama", "Jurusan");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-15s %-20s %-15s\n", mahasiswa[i][0], mahasiswa[i][1], mahasiswa[i][2]);
        }
    }
}
