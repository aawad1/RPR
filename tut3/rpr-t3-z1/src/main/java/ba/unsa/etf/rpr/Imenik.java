package ba.unsa.etf.rpr;

import java.util.HashMap;

public class Imenik {
    HashMap<String, TelefonskiBroj> imenik = new HashMap<>();
    public void dodaj(String ime, TelefonskiBroj broj){
        imenik.put(ime, broj);
    }
    public String dajBroj(String ime){
        return imenik.get(ime).ispisi();
    }
    public String dajIme(TelefonskiBroj broj){
        return imenik.get(broj).ispisi();
    }
    public String naSlovo(char s) {
        for(int i=0; i<imenik.size(); i++){
            //if(imenik[i].get(0)[0] == s){

            }
        }
    }
}
