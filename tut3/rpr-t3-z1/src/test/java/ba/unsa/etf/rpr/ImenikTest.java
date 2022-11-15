package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static ba.unsa.etf.rpr.Grad.*;
import static org.junit.jupiter.api.Assertions.*;

public class ImenikTest {
    @Test
    void dodaj(){
        Imenik imenik = new Imenik();
        imenik.dodaj("John Doe", new FiksniBroj(ZENICA,"123-456"));
        imenik.dodaj("Michael Doe", new FiksniBroj(SARAJEVO,"456-456"));
        assertEquals("032/123-456", imenik.dajBroj("John Doe"));
        assertEquals("033/456-456", imenik.dajBroj("Michael Doe"));
    }


}
