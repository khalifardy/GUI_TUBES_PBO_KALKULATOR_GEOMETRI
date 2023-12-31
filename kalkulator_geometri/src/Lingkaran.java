public class Lingkaran extends Geometri implements BangunDatar {

    private double jariJari;
    private final double pi = Math.PI; // atribut final

    // Konstruktor
    public Lingkaran(double jariJari, String nama, String desc) {
        super(nama, desc);
        this.jariJari = jariJari;
    }

    // Implementasi metode luas dari antarmuka BangunDatar
    @Override
    public double luas() {
        return pi * Math.pow(jariJari, 2);
    }

    // Implementasi metode keliling dari antarmuka BangunDatar
    @Override
    public double keliling() {
        return 2 * pi * jariJari;
    }

    // Metode getter untuk jari-jari
    public double getJariJari() {
        return jariJari;
    }
}
