import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {

        int day, month;

        Scanner input= new Scanner(System.in);
        System.out.print("Dogdugunuz GUNU(sayi cinsinden) Giriniz: ");
        day=input.nextInt();

        System.out.print("Dogdugunuz AYI(sayi cinsinden) Giriniz: ");
        month=input.nextInt();

        if (month>=13 || (day<=0 || day >31)){
            System.out.println("Gecersiz AY ve GUN..");
        }
        else if((month==3 && day >= 21) || (month==4 && day<=20)) {
                System.out.println("Burcunuz KOC ");
        }
        else if ((month==4 && day >= 21) || (month==5 && day <= 21)) {
                System.out.println("Burcunuz BOGA ");
        }
        else if ((month==5 && day >= 22) || (month==6 && day <= 22)) {
                System.out.println("Burcunuz IKIZLER ");
        }
        else if((month==6 && day >= 23) || (month==7 && day <= 22)) {
                System.out.println("Burcunuz YENGEC ");
        }
        else if ((month==7 && day >= 23) || (month==8 && day <= 22)) {
                System.out.println("Burcunuz ASLAN ");
        }

        else if ((month==8 && day >= 23 ) || (month==9 && day <= 22)) {
                System.out.println("Burcunuz BASAK ");
        }
        else if ((month==9 && day >= 23) || (month==10 && day <= 22)) {
                System.out.println("Burcunuz TERAZI ");
        }
        else if ((month==10 && day >= 23) || (month==11 && day <= 21)) {
                System.out.println("Burcunuz AKREP ");
        }
        else if ((month==11 && day >= 22) || (month==12 && day <= 21)) {
                System.out.println("Burcunuz YAY ");
        }
        else if ((month==12 && day >= 22) || (month==1 && day <= 21)) {
                System.out.println("Burcunuz OGLAK ");
        }
        else if ((month==1 && day >= 22) || (month==2 && day<=19)){
                System.out.println("Burcunuz KOVA ");
        }
        else if ((month==2 && day >= 20) || (month==3 && day<=20)) {
                System.out.println("Burcunuz BALIK ");
        }
    }
}

/*Ko?? Burcu : 21 Mart - 20 Nisan

Bo??a Burcu : 21 Nisan - 21 May??s

??kizler Burcu : 22 May??s - 22 Haziran

Yenge?? Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 A??ustos

Ba??ak Burcu : 23 A??ustos - 22 Eyl??l

Terazi Burcu : 23 Eyl??l - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kas??m

Yay Burcu : 22 Kas??m - 21 Aral??k

O??lak Burcu : 22 Aral??k - 21 Ocak

Kova Burcu : 22 Ocak - 19 ??ubat

Bal??k Burcu : 20 ??ubat - 20 Mart */
