package TugasPraktikum4;

public class Balok extends BangunRuang3D {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    double luasPermukaan(){
        return 2 * ((panjang * lebar) + (panjang *tinggi) + (lebar * tinggi));
    }

    double volume(){
        return panjang * lebar * tinggi;
    }
}
