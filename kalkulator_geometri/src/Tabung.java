public class Tabung extends Lingkaran implements BangunRuang {

    private double tinggi;

    // Konstruktor
    public Tabung(String nama, String desc, double jariJari, double tinggi) {
        super(jariJari, nama, desc);
        this.tinggi = tinggi;
    }

    // Implementasi metode volume dari antarmuka BangunRuang
    @Override
    public double volume() {
        return super.luas() * tinggi;
    }

    // Implementasi metode luaspermukaan dari antarmuka BangunRuang
    @Override
    public double luaspermukaan() {
        return 2 * super.luas() + super.keliling() * tinggi;
    }
}
