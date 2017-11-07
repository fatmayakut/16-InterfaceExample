package com.fyakut;

/**
 * /** Birbiri ile alakası olmayan classları ortak bir metot ile tek bir çatı altında toplamaya yarar.
 * çok biçimlilik kullnıldığı zaman işimize çok yarar
 * interface-arayuz abstract sınıfların biraz daha gelişmiş halidir. javada çoklu kalıtım yapılamadığı için
 * interface kullnaılır.
 * extends bir sınıf için kullnabişlir bşrden fazla sınıf aynı anda extends edilemez.
 * abstract soyut sınıflar-daha çok kapsayıcı olarak da düşünülebilir.
 * interface kullanılan yerlerde kalitıma çok ihtiyac duyulmaz
 *
 * sadece sabit değişkenler olur.
 * içi dolu olmayan metotlar yer alır
 * public olurlar.
 * interfaces den nesne olusturulmazzzz
 *
 */

public  interface Karsilastir {
    public String karsilastir(Object nesne);
}
