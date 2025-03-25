package Modul_16;

public class PersegiPanjang {
    public int panjang = 0;
    public int lebar = 0;
    public Titik awal;

    // konstruktor
    public PersegiPanjang() {
        awal = new Titik(0, 0);

    }

    public PersegiPanjang(Titik p) {
        awal = p;
    }

    public PersegiPanjang(int w, int h) {
        awal = new Titik(0, 0);
        panjang = w;
        lebar = h;
    }

    public PersegiPanjang(Titik p, int w, int h) {
        awal = p;
        panjang = w;
        lebar = h;
    }

    // method untuk memindahkan persegi panjang
    public void pindah(int x, int y) {
        awal.x = x;
        awal.y = y;
    }

    // method untuk menghitung luas persegi panjang
    public int getLuas() {
        return panjang * lebar;
    }
}
