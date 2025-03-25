package Modul_9;

public class SumBelow100 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i < 100; i++) {
            sum += i;
        }

        System.out.println("Jumlah bilangan bulat positif kurang dari 100 adalah: " + sum);
    }
}
