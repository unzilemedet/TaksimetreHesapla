package com.unzilemedet;

import java.util.Scanner;

public class TaksimetreHesapla {
    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan gidilen mesafeyi alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen gidilen mesafeyi km olarak giriniz.:");
        double mesafe = input.nextDouble();

        // Taksimetre ücreti hesaplanıyor
        double tutar = 10 + (mesafe * 2.20);

        // Minimum ödenecek tutar kontrol ediliyor
        if(tutar<20){
            tutar=20;
        }
        // Sonuç ekrana yazdırılıyor
        System.out.println("Toplam tutar: " + tutar + "TL");

    }
}
