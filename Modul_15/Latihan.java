package Modul_15;

class Lingkaran {
    private double radius;

    void IsiJari(double radius) {
        this.radius = radius;
    }

    public double perolehPi() {
        return 3.14;
    }

    public double perolehKeliling() {
        return 2 * perolehPi() * radius;
    }
}

public class Latihan {
    public static void main(String[] args) {
        Lingkaran bulatan = new Lingkaran();
        bulatan.IsiJari(75);
        System.out.println("Keliling = " + bulatan.perolehKeliling());
        System.out.println("pi = " + bulatan.perolehPi());
    }
}