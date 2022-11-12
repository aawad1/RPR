package ba.unsa.etf.rpr.t2.z1;

public class Faktorijel {
    public static double izracunaj(double broj) {
        double fakt=1;
        while(broj>1){
            fakt = fakt * broj;
            broj--;
        }
        return fakt;
    }
}
