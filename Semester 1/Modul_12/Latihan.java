package Modul_12;

public class Latihan {
    public float jumlah(int a, float b) // tanpa static
    {
        return (a + b);
    }

    public static void main(String args[]) {
        Latihan obyek = new Latihan();
        System.out.print("panggil method jumlah dengan parameter 5 dan 1.5, hasilnya = ");
        System.out.println(obyek.jumlah(5, 1.5f));
        System.out.print("panggil method jumlah dengan parameter 10 dan 2.2, hasilnya = ");
        System.out.println(obyek.jumlah(10, 2.2f));
    }
}
