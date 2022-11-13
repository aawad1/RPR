package ba.unsa.etf.rpr;

import javax.print.DocFlavor;

public enum Grad {
    TRAVNIK,
    ORASJE,
    ZENICA,
    SARAJEVO,
    LIVNO,
    TUZLA,
    MOSTAR,
    BIHAC,
    GORAZDE,
    SIROKI_BRIJEG,
    BRCKO,
    MRKONJIC_GRAD,
    BANJA_LUKA,
    PRIJEDOR,
    DOBOJ,
    SAMAC,
    BIJELJINA,
    ZVORNIK,
    PALE,
    FOCA,
    TREBINJE;

    public String pozivniBroj() {
        Integer x = 0;
        if(this.equals(BRCKO)) x=49;
        else if(this.ordinal()>10) x=this.ordinal()+50;
        else x=this.ordinal()+30;
        return "0" + x.toString();
    }
}
