package manav_kasa;

import java.util.Scanner;

public class Manav_Kasa {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        //Ürünlerin genel fiyat listesi
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlıcan = 5.0;
        double ödenecek = 0;
        
        
        
        //Döngü kontrolü yapmak için kullanılır.
        boolean kontrol = true;
        
        System.out.println("Manav Kasa Reyonuna Hoşgeldiniz...");
        
        while(kontrol){
            
            System.out.print("1 : Armut, " + " 2 : Elma, " + " 3 : Domates, " + " 4 : Muz, " + " 5 : Patlıcan" + "\n"
                    + "Lütfen Tartmak İstediğiniz Ürünü Seçin : " );
            int secim = scanner.nextInt();
            
            if (secim == 1){
                System.out.print("Lütfen Kaç Kilo Aldığınızı Girin : ");
                //Tartılacak ürünün kilogram verisi alınır
                double armut1 = scanner.nextDouble();
                double armutToplam = armut * armut1;
                // Hesaplanan veriler genel tutara eklenir
                ödenecek += armutToplam;
            }
            else if(secim == 2){
                System.out.print("Lütfen Kaç Kilo Aldığınızı Girin : ");
                //Tartılacak ürünün kilogram verisi alınır
                double elma1 = scanner.nextDouble();
                double elmaToplam = elma * elma1;
                // Hesaplanan veriler genel tutara eklenir
                ödenecek += elmaToplam;
            }
            else if(secim == 3){
                System.out.print("Lütfen Kaç Kilo Aldığınızı Girin : ");
                //Tartılacak ürünün kilogram verisi alınır
                double domates1 = scanner.nextDouble();
                double domatesToplam = domates * domates1;
                // Hesaplanan veriler genel tutara eklenir
                ödenecek += domatesToplam;
            }
            else if(secim == 4){
                System.out.print("Lütfen Kaç Kilo Aldığınızı Girin : ");
                //Tartılacak ürünün kilogram verisi alınır
                double muz1 = scanner.nextDouble();
                double muzToplam =  patlıcan * muz1;
                // Hesaplanan veriler genel tutara eklenir
                ödenecek += muzToplam;
            }
            else if(secim == 5){
                System.out.print("Lütfen Kaç Kilo Aldığınızı Girin : ");   
                //Tartılacak ürünün kilogram verisi alınır
                double patlican1 = scanner.nextDouble();
                double patlicanToplam =  patlıcan * patlican1;
                // Hesaplanan veriler genel tutara eklenir
                ödenecek += patlicanToplam;
            } 
            
            System.out.print("İşleme Devam Etmek İstermisiniz ( Evet : 1 , Hayır : 0) : ");
            int secim2 = scanner.nextInt();
            
            if(secim2 == 0){
                System.out.println("Ödenecek Tutar : " + ödenecek);
                kontrol = false;
                break;
            }
                   
        }
  
    }
    
}
