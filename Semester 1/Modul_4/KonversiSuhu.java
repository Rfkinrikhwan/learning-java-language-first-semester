package Modul_4;

import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        int celcius;
        float fahreinhet;
        float reamur;
        float kelvin;
        System.out.print("Masukkan derajat Celcius : ");
        celcius = masuk.nextInt();
        fahreinhet = 9f / 5f * celcius + 32f;
        reamur = 4f / 5f * celcius;
        kelvin = celcius + 273f;
        System.out.println("Fahreinhet : " + fahreinhet);
        System.out.println("Reamur : " + reamur);
        System.out.println("Kelvin : " + kelvin);
    }
}
