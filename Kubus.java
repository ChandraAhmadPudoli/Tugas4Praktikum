package TugasPraktikum4;

public class Kubus extends BangunRuang3D {

    private double sisi;

    public Kubus(double sisi){
        this.sisi = sisi;
    }

    double luasPermukaan(){
        return 6 * sisi * sisi;
    }

    double volume(){
        return sisi * sisi * sisi;
    }
}
