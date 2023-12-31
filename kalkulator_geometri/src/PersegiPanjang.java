public class PersegiPanjang extends Geometri implements BangunDatar {

    private double panjang;
    private double lebar;

    // Konstruktor
    public PersegiPanjang(String nama, String desc, double panjang, double lebar) {
        super(nama, desc);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Implementasi metode luas dari antarmuka BangunDatar
    @Override
    public double luas() {
        return panjang * lebar;
    }

    // Implementasi metode keliling dari antarmuka BangunDatar
    @Override
    public double keliling() {
        return 2 * (panjang + lebar);
    }

    // Metode getter untuk panjang
    public double getPanjang() {
        return panjang;
    }

    // Metode getter untuk lebar
    public double getLebar() {
        return lebar;
    }
}
