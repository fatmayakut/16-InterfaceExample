package com.fyakut;

public class Main {

    /**
     * interface-arayuz abstract sınıfların biraz daha gelişmiş halidir. javada çoklu kalıtım yapılamadığı için
     * interface kullnaılır.
     * extends bir sınıf için kullnabişlir bşrden fazla sınıf aynı anda extends edilemez.
     * abstract soyut sınıflar-daha çok kapsayıcı olarak da düşünülebilir.
     * interface kullanılan yerlerde kalitıma çok ihtiyac duyulmaz
     */

    public static void main(String[] args) {
        Kare k1=new Kare(5);
        Kare k2=new Kare(6);
        System.out.println("karsılastır:"+k1.karsilastir(k2));
Personel p1=new Personel(6);
        Personel p2=new Personel(10);
        System.out.println("personel karsılastırmasdı:"+p1.karsilastir(p2));

nesneKarsılastr(k1,k2);
nesneKarsılastr(p1,p2);



    }
    public static  void nesneKarsılastr(Karsilastir k1,Karsilastir k2){
        System.out.println("karsılasr-tırr:"+k1.karsilastir(k2));
    }


}
