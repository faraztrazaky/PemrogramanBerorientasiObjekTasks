import Transportasi.Mobil;
import Transportasi.Bicycle;

public class TransportasiDemo {
    public static void main(String[] args) {
        Mobil mbl = new Mobil();
        mbl.hidupkanMobil("Avanza");
        mbl.maju();
        mbl.belok();
        mbl.ubahGigi("Avanza");
        mbl.mundur();
        mbl.matikanMobil("Avanza");

        System.out.println(); // pemisah

        Bicycle sepeda = new Bicycle();
        sepeda.speedUp(3);
        sepeda.changeGear(2);
    }
}
