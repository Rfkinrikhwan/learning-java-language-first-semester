public class NonReskursif {

    public static void main(String[] args) {
        System.out.println(faktorialNonReskursif(10));
    }

    public static int faktorialNonReskursif(int n) {
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil = hasil * i;
        }
        return hasil;
    }
}
