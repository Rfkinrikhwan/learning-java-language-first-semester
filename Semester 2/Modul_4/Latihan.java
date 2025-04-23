import java.util.Scanner;

public class FibonacciRekursif {

    // Fungsi rekursif untuk menghitung bilangan Fibonacci ke-n
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) return n;

        return fibonacci(n - 1) + fibonacci(n - 2); // rekursi
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // buat scanner untuk input
        System.out.print("Masukkan angka n untuk menghitung Fibonacci ke-n: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci ke-" + n + " adalah " + fibonacci(n));

        scanner.close();
    }
}
