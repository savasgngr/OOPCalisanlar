/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopcalısanlar;

/**
 *
 * @author SAVAS
 */
public class Calısan {
    
    private  String ad;
    private  String soyad;
    private int id;

    public Calısan(String ad, String soyad, int id) {
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    
    public void bilgilerigoster(){
        System.out.println("Çalışan bilgileri");
        System.out.println("Ad:"+ad);
        System.out.println("soyad:"+soyad);
        System.out.println("Id:"+id);
        
    }
}
