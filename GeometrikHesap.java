/*
 * Ad Soyad: Muhammet Eren Mente
 * Ogrenci No: 250542026
 * Tarih: 26.10.2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan bir yarı çap alır ve daire'nin
 * alanını, çevresini, çapını, hacmini ve yüzeyalanını
 * duzenli bir formatta ekrana yazdirir.
 */

import java.util.Scanner;

public class GeometrikHesap{
    public static void main(String[] args){
        
        //Scanner objesi oluşturuldu

        Scanner input=new Scanner(System.in);        
        
        //değişken atama kısmı
        
        final double pi=3.14;
        
        
        //kullanıcıdan yarıçapı alıyor
        System.out.println("=== Geometrik Hesaplayici ===");
        System.out.print("Yariçapi giriniz:");
        int yaricap=input.nextInt();
        
        //işlemler kısmı
        
        double daireAlani=pi*Math.pow(yaricap,2);
        double daireCevresi=2*pi*yaricap;
        double daireCap=2*yaricap;
        double kureHacmi=4.0/3.0*pi*Math.pow(yaricap,3);
        double kureYuzeyAlani=4*pi*Math.pow(yaricap,2);

        //Sonuç kısmı

        System.out.println("\nSONUCLAR:");
        System.out.println("---------");
        System.out.printf("%nDaire Alani     : %.2f",daireAlani);
        System.out.printf("%nDaire Çevresi     : %.2f",daireCevresi);
        System.out.printf("%nDaire Çapi     : %.2f",daireCap);
        System.out.printf("%nKüre hacmi     : %.2f",kureHacmi);
        System.out.printf("%nKüre yüzey alani     : %.2f",kureYuzeyAlani);
        
        //input kapatma
        input.close();
    }
}
