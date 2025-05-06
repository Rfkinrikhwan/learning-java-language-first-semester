import java.util.*;

public class ExhaustiveSubsetSum {
    static void cariSubset(int[] arr, int target) {
        int n = arr.length;
        boolean ditemukan = false;
        // Total kemungkinan kombinasi = 2^n
        int totalKombinasi = 1 << n;
        System.out.println("Subset dengan jumlah " + target + ":");
        for (int i = 1; i < totalKombinasi; i++) {
            List<Integer> subset = new ArrayList<>();
            int jumlah = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    subset.add(arr[j]);
                    jumlah += arr[j];
                }
            }
            if (jumlah == target) {
                System.out.println(subset);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada kombinasi yang cocok.");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5};
        int target = 8;
        cariSubset(arr, target);
    }
}
