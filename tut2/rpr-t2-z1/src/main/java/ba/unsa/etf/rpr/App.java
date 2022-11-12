package ba.unsa.etf.rpr;

import ba.unsa.etf.rpr.t2.z1.Faktorijel;
import ba.unsa.etf.rpr.t2.z1.Sinus;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        if(args.length != 2){
            System.err.println("Nedovoljan broj argumenata java -jar rpr-t2-z1-jar [funkcija] [argument]");
                    }
        else if(!args[0].equals("sinus") && !args[0].equals("faktorijel")){
            System.err.println("Nevalidna funkcija, sinus i faktorijel su podrzane funkcije");
        }
        else{
            try{
                String funkcija = args[0];
                double input = Double.parseDouble(args[1]);
                switch (funkcija){
                    case "sinus":
                        System.out.println("sinus("+input+")="+ Sinus.izracunaj(input));
                        break;
                    case "faktorijel":
                        System.out.println("faktorijel("+input+")="+ Faktorijel.izracunaj(input));
                        break;
                }
            } catch (Exception e) {
                System.err.println("Nevalidan drugi argument, mora biti broj");
            }
        }
    }
}
