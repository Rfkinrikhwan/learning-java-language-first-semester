package Modul_5;

import java.util.Scanner;

public class Latihan {
    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        int pil;
        System.out.print("Masukkan pilihan : ");
        pil = masuk.nextInt();
        if (pil == 1)
            System.out.println("Jurusan MI/D3");
        else if (pil == 2)
            System.out.println("Jurusan TK/D3");
        else if (pil == 3)
            System.out.println("Jurusan KA/D3");
        else if (pil == 4)
            System.out.println("Jurusan TI/S1");
        else if (pil == 5)
            System.out.println("Jurusan SI/S1");
        else
            System.out.println("Pilihan Salah!!!");
    }
}