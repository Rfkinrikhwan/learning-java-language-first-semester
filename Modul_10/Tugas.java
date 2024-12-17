package Modul_10;

public class Tugas {
    public static void main(String args[]) {
        StringBuffer sbuf = new StringBuffer(25);
        System.out.println("\n");
        System.out.println("Isi : " + sbuf.toString());
        System.out.println("Kapasitas : " + sbuf.capacity());
        System.out.println("Panjang : " + sbuf.length());

        System.out.println("\n");
        sbuf.append("Selamat ");
        sbuf.append("Belajar Java");
        System.out.println("Isi : " + sbuf.toString());
        System.out.println("Kapasitas : " + sbuf.capacity());
        System.out.println("Panjang : " + sbuf.length());

        System.out.println("\n");
        sbuf.replace(0, 20, "Selamat");
        System.out.println("Isi : " + sbuf.toString());
        System.out.println("Kapasitas : " + sbuf.capacity());
        System.out.println("Panjang : " + sbuf.length());
    }
}
