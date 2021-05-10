package AlgoritmaOrnekleri;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        String girilenKelime, tersiAlinmisHali = "" ;
        Scanner tara = new Scanner(System.in);

        System.out.println("bir kelime giriniz :");
        girilenKelime = tara.nextLine();

        int length = girilenKelime.length();

        for (int i=0; i<=girilenKelime.length()-1;i++){
            tersiAlinmisHali += girilenKelime.charAt(length-1-i);
        }
        if (girilenKelime.equals(tersiAlinmisHali)){
            System.out.println("polindromik keime");
        }else{
            System.out.println("polindromik kelime değil");
        }

    }
}
