package Modul_11;

public class Tugas {
    public int jumlah() {
        int a = 7, b = 15;
        return (a + b);
    }

    public int kurang() {
        int a = 7, b = 15;
        return (a - b);
    }

    public int kali() {
        int a = 7, b = 15;
        return (a * b);
    }

    public int bagi() {
        int a = 7, b = 15;
        return (a / b);
    }

    public static void main(String args[]) {
        Tugas obyek = new Tugas();
        System.out.print("Hasil pemanggilan method jumlah : ");
        System.out.print(obyek.jumlah());

        System.out.println();

        System.out.print("Hasil pemanggilan method kurang : ");
        System.out.print(obyek.kurang());

        System.out.println();

        System.out.print("Hasil pemanggilan method kali : ");
        System.out.print(obyek.kali());

        System.out.println();

        System.out.print("Hasil pemanggilan method bagi : ");
        System.out.print(obyek.bagi());
    }
}
