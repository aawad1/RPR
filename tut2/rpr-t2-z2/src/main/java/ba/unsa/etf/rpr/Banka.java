package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Banka {
    private long brojRacuna;
    private List<Korisnik> korisnici;
    private List<Uposlenik> uposlenici;

    public Banka() {
        this.korisnici = new ArrayList<Korisnik>();
        this.uposlenici = new ArrayList<Uposlenik>();
    }

    public Korisnik kreirajNovogKorisinka(String ime, String prezime) {
        Korisnik korisnik = new Korisnik(ime, prezime);
        this.korisnici.add(korisnik);
        return korisnik;
    }

    public Uposlenik kreirajNovogUposlenika(String ime, String prezime) {
        Uposlenik uposlenik = new Uposlenik(ime, prezime);
        this.uposlenici.add(uposlenik);
        return uposlenik;
    }

    public Racun kreirajRacunZaKorisnika(Korisnik korisnik) {
        Racun racun = null;
        for(int i=0; i<this.korisnici.size(); i++) {
            if(this.korisnici.get(i).equals(korisnik)){
                Long brojRacuna = (new Random().nextLong());
                racun = new Racun(brojRacuna, this.korisnici.get(i));
                break;
            }
        }
        return racun;
    }
}
