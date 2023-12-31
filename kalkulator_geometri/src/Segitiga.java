public class Segitiga extends Geometri implements BangunDatar {

    private double alas;
    private double tinggi;
    private double sisi2;
    private double sisi3;

    // Konstruktor
    public Segitiga(String nama, String desc, double alas, double tinggi, double sisi2, double sisi3) {
        super(nama, desc);
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    // Implementasi metode luas dari antarmuka BangunDatar
    @Override
    public double luas() {
        return alas * tinggi * 0.5;
    }

    // Implementasi metode keliling dari antarmuka BangunDatar
    @Override
    public double keliling() {
        return alas + sisi2 + sisi3;
    }

    // Metode getter untuk alas
    public double getAlas() {
        return alas;
    }

    // Metode getter untuk tinggi
    public double getTinggi() {
        return tinggi;
    }

    // Metode getter untuk sisi2
    public double getSisi2() {
        return sisi2;
    }

    // Metode getter untuk sisi3
    public double getSisi3() {
        return sisi3;
    }
}
