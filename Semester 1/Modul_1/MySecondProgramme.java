import java.util.Scanner;

public class MySecondProgramme {
    // Metode untuk menyapa pengguna
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Selamat datang di program sederhana.");
    }

    // Metode untuk menghitung penjumlahan dua angka
    public static int sum(int a, int b) {
        return a + b;
    }

    // Metode utama
    public static void main(String[] args) {
        // Membuat scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);

        // Menyapa pengguna
        System.out.println("Masukkan nama Anda:");
        String name = scanner.nextLine(); // Input nama
        greetUser(name); // Memanggil metode greetUser

        // Input angka dari pengguna
        System.out.println("Masukkan angka pertama:");
        int num1 = scanner.nextInt(); // Input angka pertama

        System.out.println("Masukkan angka kedua:");
        int num2 = scanner.nextInt(); // Input angka kedua

        // Menghitung penjumlahan dua angka
        int result = sum(num1, num2);

        // Menampilkan hasil
        System.out.println("Hasil penjumlahan " + num1 + " dan " + num2 + " adalah: " + result);

        // Menampilkan pesan akhir
        System.out.println("Program selesai. Terima kasih, " + name + "!");
    }
}
