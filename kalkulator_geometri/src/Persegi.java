public class Persegi extends Geometri implements BangunDatar {

    private double sisi;

    // Konstruktor
    public Persegi(String nama, String desc, double sisi) {
        super(nama, desc);
        this.sisi = sisi;
    }

    // Implementasi metode luas dari antarmuka BangunDatar
    @Override
    public double luas() {
        return Math.pow(sisi, 2);
    }

    // Implementasi metode keliling dari antarmuka BangunDatar
    @Override
    public double keliling() {
        return 4 * sisi;
    }

    // Metode getter untuk sisi
    public double getSisi() {
        return sisi;
    }
}

