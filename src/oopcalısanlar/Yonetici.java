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
public class Yonetici extends Calısan{
    
    public int sorumlu_sayısı;
    
    public Yonetici(String ad, String soyad, int id,int sorumlu_sayısı) {
        super(ad, soyad, id);
        this.sorumlu_sayısı=sorumlu_sayısı; 
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster(); 
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı:"+sorumlu_sayısı);
    }
    public  void zamyap(int miktar){
        
        System.out.println(getAd()+"çaşanınıza"+miktar+"tl zam yapılmıştır...");
    }
    
}
