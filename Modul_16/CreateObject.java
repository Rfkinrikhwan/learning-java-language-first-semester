package Modul_16;

public class CreateObject {
    public static void main(String[] args) {
        // mendeklarasikan dan menciptakan satu obyek Titik
        Titik titikAwal = new Titik(23, 94);
        // mendeklarasikan & menciptakan 2 obyek PersegiPanjang
        PersegiPanjang persegiSatu = new PersegiPanjang(titikAwal, 100, 200);
        PersegiPanjang persegiDua = new PersegiPanjang(50, 100);
        // menampilkan panjang, lebar dan luas persegiSatu
        System.out.println("Panjang persegiSatu: " +
                persegiSatu.panjang);
        System.out.println("Lebar persegiSatu: " +
                persegiSatu.lebar);
        System.out.println("Luas persegiSatu: " +
                persegiSatu.getLuas());

        // mengeset posisi persegiDua
        persegiDua.awal = persegiSatu.awal;
        // menampilkan posisi persegiDua
        System.out.println("Posisi X dari persegiDua: "
                + persegiDua.awal.x);
        System.out.println("Posisi Y dari persegiDua: "
                + persegiDua.awal.y);
        // memindahkan persegiDua dan menampilkan posisi barunya
        persegiDua.pindah(40, 72);
        System.out.println("Posisi X dari persegiDua: "
                + persegiDua.awal.x);
        System.out.println("Posisi Y dari persegiDua: "
                + persegiDua.awal.y);
    }
}
