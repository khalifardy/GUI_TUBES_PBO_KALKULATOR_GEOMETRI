public class Prisma extends Segitiga implements BangunRuang {

    private double tinggiPrisma;

    // Konstruktor
    public Prisma(String nama, String desc, double alas, double tinggi, double sisi2, double sisi3, double tinggiPrisma) {
        super(nama, desc, alas, tinggi, sisi2, sisi3);
        this.tinggiPrisma = tinggiPrisma;
    }

    // Implementasi metode volume dari antarmuka BangunRuang
    @Override
    public double volume() {
        return super.luas() * tinggiPrisma;
    }

    // Implementasi metode luaspermukaan dari antarmuka BangunRuang
    @Override
    public double luaspermukaan() {
        return 2 * super.luas() + tinggiPrisma * (super.getAlas() + super.getSisi2() + super.getSisi3());
    }
}
