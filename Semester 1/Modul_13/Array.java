package Modul_13;

import java.util.Scanner;

public class Array {
    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        float nilai[] = new float[5];
        System.out.println("masukkan 5 buah data nilai");
        for (int i = 0; i < 5; i++) {
            System.out.print("Data ke" + (i + 1) + ": ");
            nilai[i] = masuk.nextFloat();
        }
        System.out.println("data nilai yang dimasukkan");
        for (int i = 0; i < 5; i++)
            System.out.println(nilai[i]);
    }
}
