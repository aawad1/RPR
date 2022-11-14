package ba.unsa.etf.rpr;

public abstract class TelefonskiBroj {
    private int broj;

    public TelefonskiBroj(int broj) {
        this.broj = broj;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    abstract public String ispisi(){

    }
    abstract public int hashCode();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelefonskiBroj that = (TelefonskiBroj) o;
        return broj == that.broj;
    }

    @Override
    public String toString() {
        return "TelefonskiBroj{" +
                "broj=" + broj +
                '}';
    }
}
