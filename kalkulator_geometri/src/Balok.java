public class Balok extends PersegiPanjang implements BangunRuang {

    private double tinggi;

    // Konstruktor
    public Balok(String nama, String desc, double panjang, double lebar, double tinggi) {
        super(nama, desc, panjang, lebar);
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
        return 2 * (super.luas() + super.getPanjang() * tinggi + super.getLebar() * tinggi);
    }
}
