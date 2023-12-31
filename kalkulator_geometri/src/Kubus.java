public class Kubus extends Persegi implements BangunRuang {

    // Konstruktor
    public Kubus(String nama, String desc, double sisi) {
        super(nama, desc, sisi);
    }

    // Implementasi metode volume dari antarmuka BangunRuang
    @Override
    public double volume() {
        return Math.pow(super.getSisi(), 3);
    }

    // Implementasi metode luaspermukaan dari antarmuka BangunRuang
    @Override
    public double luaspermukaan() {
        return 6 * super.luas();
    }
}
