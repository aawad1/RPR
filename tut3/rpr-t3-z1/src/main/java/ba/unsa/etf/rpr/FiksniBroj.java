package ba.unsa.etf.rpr;

import java.util.HashMap;
import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj {
    private Grad grad;
    private String broj;

    public FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }
    public String ispisi(){
        return (grad.pozivniBroj() + "/" + broj);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FiksniBroj that = (FiksniBroj) o;
        return grad == that.grad && Objects.equals(broj, that.broj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grad, broj);
    }
}
