package Modul_4;

import java.util.Scanner;

public class Konversi2 {
    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        int celcius;
        float fahreinhet;
        System.out.print("Masukkan derajat Celcius : ");
        celcius = masuk.nextInt();
        fahreinhet = 9f / 5f * celcius + 32f;
        System.out.println("Fahreinhet : " + fahreinhet);
    }
}
