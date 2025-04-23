// Brute Force String Matching
public class BruteForceStringMatching {

    public static int search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return i; // Mengembalikan indeks awal jika pola ditemukan
            }
        }
        return -1; // Mengembalikan -1 jika tidak ditemukan
    }

    public static void main(String[] args) {
        String text = "ABC ABCD AB AB CD AB CD";
        String pattern = "AB CD";
        int index = search(text, pattern);

        if (index != -1) {
            System.out.println("Pola \"" + pattern + "\" ditemukan di indeks " + index);
        } else {
            System.out.println("Pola \"" + pattern + "\" tidak ditemukan");
        }
    }
}
