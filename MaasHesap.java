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

public class MaasHesap{
    public static void main(String[] args){
        
        //Scanner objesi atama
        
        Scanner input=new Scanner(System.in);
        
        //Değişken atama
        
        String ad,soyad;
        double brütMaas;
        int haftalikCalismaSaati, mesaiSaatSayisi;
        double damgaVergisi,gunlukNetKazanc,saatlikNetKazanc,kesintiOrani,netMaas,toplamGelir,mesaiUcreti,sgk,gelirVergisi,toplamKesinti;
        final double sgkOran=0.14;
        final double gelirVergisiOran=0.15;
        final double damgaVergisiOran=0.00759;
        //kullanıcıdan veri alma

        System.out.print("Adinizi giriniz: ");        
        ad=input.nextLine();
        System.out.print("Soyadinizi giriniz: ");
        soyad=input.nextLine();
        System.out.print("Brüt Maasinizi giriniz: ");
        brütMaas=input.nextDouble();
        System.out.print("Haftalik calisma saatini giriniz: ");
        haftalikCalismaSaati=input.nextInt();
        System.out.print("Mesai saat sayinizi giriniz: ");
        mesaiSaatSayisi=input.nextInt();

        //işlemler

        mesaiUcreti=(brütMaas/160)*(mesaiSaatSayisi*1.5);
        toplamGelir=brütMaas+mesaiUcreti;
        sgk=toplamGelir*sgkOran;
        gelirVergisi=toplamGelir*gelirVergisiOran;
        damgaVergisi=toplamGelir*damgaVergisiOran;
        toplamKesinti=sgk+gelirVergisi+damgaVergisi;
        netMaas=toplamGelir-toplamKesinti;
        kesintiOrani=(toplamKesinti/toplamGelir)*100;               
        saatlikNetKazanc=netMaas/176;
        gunlukNetKazanc=netMaas/22;

        //Çıktı

        System.out.println("====================");
        System.out.println("    MAAS BORDROSU");
        System.out.println("====================");
        System.out.println("Calisan: "+ad+ " " +soyad);
        System.out.println("\nGELIRLER:");
        System.out.printf("  Brut Maas        :%.2f",brütMaas);
        System.out.printf("\n       Mesai Ucreti ("+mesaiSaatSayisi+") Saat:"+" :%.2f",mesaiUcreti);
        System.out.println("    ----------------");
        System.out.printf("      Toplam Gelir            :%.2f%n",toplamGelir);
        System.out.println("\nKESINTILER");
        System.out.printf("    SGK kesintisi (%.1f%%)     : %.2f%n",sgkOran*100,sgk);
        System.out.printf("    Gelir vergisi (%.1f%%)     : %.2f%n",gelirVergisiOran*100,gelirVergisi);
        System.out.printf("    Damga vergisi (%.1f%%)      : %.2f%n",damgaVergisiOran*100,damgaVergisi);
        System.out.println("    ----------------");
        System.out.printf("    TOPLAM KESINTI    :%.2f%n",toplamKesinti);
        System.out.printf("    NET MAAS          :%.2f",netMaas);

        input.close();
    }
}
