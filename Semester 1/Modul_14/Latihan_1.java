package Modul_14;

import java.util.Scanner;

public class Latihan_1 {

    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        int nilai[][] = new int[2][3];
        System.out.println("Masukkan data nilai");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("(" + (i + 1) + " , " + (j + 1) + ")" + " : ");
                nilai[i][j] = masuk.nextInt();
            }
        }
        System.out.println("Data nilai yang dimasukan");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(nilai[i][j] + " ");
            System.out.println();
        }

    }
}
