// Sequential Search (Pencarian Sequensial)
public class SequentialSearch {

    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Mengembalikan indeks jika ditemukan
            }
        }
        return -1; // Mengembalikan -1 jika tidak ditemukan
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 1, 7, 3, 8};
        int target = 7;
        int index = search(arr, target);

        if (index != -1) {
            System.out.println("Target " + target + " ditemukan di indeks " + index);
        } else {
            System.out.println("Target " + target + " tidak ditemukan");
        }
    }
}
