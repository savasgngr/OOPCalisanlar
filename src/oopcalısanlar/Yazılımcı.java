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
public class Yazılımcı extends Calısan{
    
    private  String diller;
    public Yazılımcı(String ad, String soyad, int id,String diller) {
        super(ad, soyad, id);
        this.diller=diller;
    }
    public void format(String isletim_sistemi   ){
        System.out.println(getAd()+""+isletim_sistemi+"ni yüklüyor... ");
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster(); 
        System.out.println("bildiği diller:"+diller);
    }
    
    
    
    
}
