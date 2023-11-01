package TugasPraktikum4;

public class BangunRuang {
    public static void main(String[] args) {
        Kubus kubus = new Kubus(5);
        Balok balok = new Balok(4, 5, 6);

        System.out.println("Luas Permukaan Kubus : "+ kubus.luasPermukaan());
        System.out.println("Volume Kubus : "+ kubus.volume());
        System.out.println("Luas Permukaan Balok : "+ balok.luasPermukaan());
        System.out.println("Volume Balok : "+ balok.volume());
    }
}
