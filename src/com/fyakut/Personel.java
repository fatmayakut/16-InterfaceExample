package com.fyakut;

public class Personel implements Karsilastir{
    private int yas;

    public Personel(int yas) {
        this.yas = yas;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String karsilastir(Object nesne) {
        Personel p2 = (Personel) nesne;
        if (this.yas>p2.yas) {
            return "personel 1 personel 2 den buyuktur";
        } else if (this.yas<p2.yas)
        {
            return "personel 1 personel 2 den kucuktur\"";
        }
        else{
            return "alanlar esittir";
        }
    }
}
