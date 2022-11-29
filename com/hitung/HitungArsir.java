package com.hitung;

import com.bentuk.Lingkaran;
import com.bentuk.Persegi;

public class HitungArsir {
    double hasil;

    Lingkaran lingkaran;
    Persegi persegi;

    public HitungArsir(Lingkaran lingkaran, Persegi persegi){
        this.lingkaran = lingkaran;
        this.persegi = persegi;
    }

    public void tampilkanHasil(){
        lingkaran.tampilluas();
        persegi.tampilluas();
        hasil = persegi.luas() - (lingkaran.luas() / 2);
        System.out.println("hasilnya adalah: " + hasil);
    }
    
}