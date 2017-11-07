package com.fyakut;

public class Kare  implements Karsilastir{
    private double kenaruzunlugu;

    public Kare(double kenaruzunlugu) {
        this.kenaruzunlugu = kenaruzunlugu;
    }

    public double getKenaruzunlugu() {
        return kenaruzunlugu;
    }

    public void setKenaruzunlugu(double kenaruzunlugu) {
        this.kenaruzunlugu = kenaruzunlugu;
    }
    public double alanHesapla(){
        return kenaruzunlugu*kenaruzunlugu;
    }

    @Override
    public String karsilastir(Object nesne) {
        Kare k2 = (Kare) nesne;
        if (this.alanHesapla() > k2.alanHesapla()) {
            return "kare 1 alanı kare2 alanından buyuktur";
        } else if (this.alanHesapla() < k2.alanHesapla())
        {
            return "kare 1 alanı kare2 alanından kucuktur";
        }
        else{
            return "alanlar esittir";
        }

    }
}
