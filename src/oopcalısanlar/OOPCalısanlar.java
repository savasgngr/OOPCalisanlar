/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopcalısanlar;

import java.util.Scanner;

public class OOPCalısanlar {

    public static void main(String[] args) {
        
        Scanner scanner =new Scanner(System.in);
       //birinci işlem menüsü 
        System.out.println("programa hoşgeldiniz...");
            
     String islemler="İşlemler menüsü...\n"+
                       "1 yazılımcı işlemleri \n"+
                        "2 yönetici işlemleri\n"+
                        "çıkış için q ya basınız.";
     
        System.out.println("************************");
        System.out.println(islemler);
        System.out.println("************************");
        
        //birnici işlem menüsü döngüsü
        while (true) {            
            
            System.out.print("işlemi seçiniz:");
            
            String islem=scanner.nextLine();
           
            if (islem.equals("q")) {
                
                System.out.println("işlemden çıkılıyor");
                break;
                
            }else if (islem.equals("1")) {
                //yazılımcı işlemleri
                Yazılımcı yazılımcı=new Yazılımcı("savaş ", "GÜNGÖR", 1106, "JAVA DEVELOPER");
                
                String yazılımcı_islem="Yazılımcı menüsune hoşgeldiniz\n"+"1 fortmat at\n"+
                                       " 2 bilgileri göster\n"+
                                       " çıkış işelemi için q ya basınız.";
                System.out.println(yazılımcı_islem);
                //yazılımcı işlem menüsü döngüsü
                while (true) {                    
                        System.out.print("işlemi seçiniz:");
                       String y_islem=scanner.nextLine();
                    if (y_islem.equals("q")) {
                        System.out.println("Yazılımcı işlemleri sona erdirdiniz");
                        break; 
                    }else if (y_islem.equals("1")) {
                        
                        System.out.print("işletim sistemi:");
                        String isletim_sistemi=scanner.nextLine();
                        
                        yazılımcı.format(isletim_sistemi);
                        
                        
                    }else if (y_islem.equals("2")) {
                        
                        yazılımcı.bilgilerigoster();
                    }
                    //yazılımcı menüsünden çıkış işlemi
                    else {
                        
                        System.out.println("Geçersiz işlem..."+
                                "yeniden seçim yapınız."
                                );
                    }
                        
                    
                }
                
                
            }else if (islem.equals("2")) {
                //yönetici işlem menüsü 
                Yonetici yonetici = new Yonetici("savas", "güngör", 456, 12);
                
                String yonetici_islem="Yönetici menüsüne hoşgeldiniz..\n"+
                                       "1 zam yap\n"+
                                       "2 bilgileri göster\n"+"cıkış işlemi için q ya basınız";
                
                System.out.println(yonetici_islem);
                 //yönetici işkem menüsü döngüsü      
                while (true) {                    
                    
                    System.out.println("işlemi seçiniz:");
                    String yon_islem=scanner.nextLine();
                    
                    if (yon_islem.equals("q")) {
                        
                        System.out.println("Yönetici işlemlerinden çıkış yapılıyor...");
                        break;
                    }else if (yon_islem.equals("1")) {
                        System.out.println("ne kadar zam yapmak istiyorsunuz:");
                        int zam =scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamyap(zam);
   
                    }else if (yon_islem.equals("2")) {
                        yonetici.bilgilerigoster();
                    }
                    //yönetici menüsünden çıkış işlemi
                    else {
                        System.out.println("işlem seçiminiz hatalı tekrar seçim yapınız");
                    }
                    
                }
                
                
            }else {
                //tüm programdan çıkış işlemi
                System.out.println("yanlış işlem seçimi yaptınız...\n"
                        + "tekrar seçim yapınız...");
            }
            
        }
    }
    
}
