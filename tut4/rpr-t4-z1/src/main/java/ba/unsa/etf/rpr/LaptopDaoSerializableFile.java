package ba.unsa.etf.rpr;

import java.io.File;
import java.util.ArrayList;

import static java.awt.SystemColor.text;

public class LaptopDaoSerializableFile implements LaptopDao {
    private ArrayList<Laptop> laptopi;
    private File file = new File ("text.txt");



    @Override
    public void dodajLaptopUListu(Laptop laptop) {
        laptopi.add(laptop);
        
    }

    @Override
    public void dodajLaptopUFile(Laptop laptop) {

    }

    @Override
    public void getLaptop(String procesor) {

    }

    @Override
    public void napuniListu(ArrayList<Laptop> laptopi) {

    }

    @Override
    public void vratiPodatkeIzDatoteke() {

    }
}
