package com.example.uygulama1;

public class Metot4 {
    public static void main(String[] args) {

    }
    public static double faturaHesapla(double miktar){
        double ucret=0;
        if(miktar <=200){
            ucret=miktar *2;
        } else if(miktar <=300){
            ucret=200 * 2 + (miktar - 200) * 2.5;
        }else{
            ucret = 200 * 2 + 100 * 2.5 + (miktar - 300) * 4;
        }
        return ucret;
    }
}
