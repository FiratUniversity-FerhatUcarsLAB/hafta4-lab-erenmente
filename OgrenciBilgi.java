import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        Scanner.input = new input(System.in);
        System.out.print("Adınızı giriniz:");
        ad = input.nextLine();
        System.out.print("\nSoyadınızı giriniz:");
        soyad = input.nextLine();
        System.out.print("\nÖğrenci numaranızı giriniz:");
        ogrenciNo = input.nextInt();
        System.out.print("\nYaşınızı giriniz:");
        yas = input.nextInt();
        System.out.print("\nNot ortalamanızı giriniz:");
        gpa = input.nextInt();

        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println("Ad Soyad: " + ad + " " + soyad);
        System.out.println("Ogrenci no: " + ogrenciNo);
        System.out.println("Yas:" + yas);
        System.out.printf("%.2f", gpa"%n");
        if (gpa > 2.00) {
            System.out.println("Durum: Başarılı öğrenci.");
        } else {
            System.out.println("Durum:Başarısız öğrenci");
        }
    }
}