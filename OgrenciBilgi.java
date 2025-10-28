/*
 * Ad Soyad: Muhammet Eren Mente
 * Ogrenci No: 250542026
 * Tarih: 26.10.2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        // Scanner objesi olusturun
        Scanner input = new  Scanner(System.in);
        
        // Degisken tanimlamalari
        // String ad, soyad;
        String ad,soyad;
        // int ogrenciNo, yas;
        int ogrenciNo,yas;
        // double gpa;
        float gpa;
        
        // Kullanicidan bilgileri alin
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println();
        
        // Ad
        System.out.print("Adınızı giriniz:");
        ad = input.nextLine();
        
        // Soyad
         System.out.print("\nSoyadınızı giriniz:");
        soyad = input.nextLine();
        
        // Ogrenci No
        System.out.print("\nÖğrenci numaranızı giriniz:");
        ogrenciNo = input.nextInt();
        
        // Yas
        System.out.print("\nYaşınızı giriniz:");
        yas = input.nextInt();
        
        // GPA
        System.out.print("\nNot ortalamanızı giriniz:");
        gpa = input.nextFloat();
        
        // Bilgileri ekrana yazdirin
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        System.out.println("Ad Soyad: " + ad + " " + soyad);
        System.out.println("Ogrenci no: " + ogrenciNo);
        System.out.println("Yas:" + yas);
        System.out.printf("%.2f", gpa);
        if (gpa >= 2.00) {
            System.out.println("\nDurum: Başarılı öğrenci.");
        } else {
            System.out.println("\nDurum:Başarısız öğrenci");
        // COZUMUNUZU BURAYA YAZIN
        
        // Scanner'i kapatin (önemli pratik)
        input.close();
    }
    }
}
