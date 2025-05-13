public class InterpolationSearch {

    public static int interpolationSearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && x >= arr[low] && x <= arr[high]) {
            if (arr[high] == arr[low]) {
                if (arr[low] == x) {
                    return low;
                } else {
                    return -1;
                }
            }

            int pos = low + ((x - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            if (arr[pos] == x) {
                return pos;
            } else if (arr[pos] < x) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50, 60, 70};
        int cari = 50;
        int hasil = interpolationSearch(data, cari);

        if (hasil != -1) {
            System.out.println("Data ditemukan di indeks ke-" + hasil);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
