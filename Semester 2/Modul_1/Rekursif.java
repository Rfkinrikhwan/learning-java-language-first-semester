public class Rekursif {

    // Fungsi rekursif untuk menghitung faktorial dari sebuah angka
    public static int faktorial(int n) {
        if (n <= 1) { // Base case
            return 1;
        } else {
            return n * faktorial(n - 1); // Recursive call
        }
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Faktorial dari " + number + " adalah: " + faktorial(number));
    }
}

