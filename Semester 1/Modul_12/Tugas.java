package Modul_12;

public class Tugas {
    public float nomorTerkecil(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String args[]) {
        Tugas obyek = new Tugas();

        System.out.println(obyek.nomorTerkecil(5, 10, 6));
    }
}
