package Metotlar;

import java.util.Scanner;

public class GelismisHesapMakinesi {
    static void plus() {
        int result = 0, number, counter = 1;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.print(counter + ". sayı : ");
            number = inp.nextInt();
            counter++;
            result += number;

        } while (number != 0);
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner inp = new Scanner(System.in);

        System.out.print("Eksilen sayıyı giriniz : ");
        int result = inp.nextInt();
        int number;
        int counter = 1;

        do {
            System.out.print(counter + ". çıkan sayı : ");
            number = inp.nextInt();
            counter++;
            result -= number;
        } while (number != 0);
        System.out.println("Sonuç : " + result);
    }

    static void times() {
        Scanner inp = new Scanner(System.in);

        int counter = 1, result = 1, number;

        do {
            System.out.print(counter + ". sayı : ");
            number = inp.nextInt();
            counter++;
            result *= number;
        } while (number != 1);
        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        Scanner inp = new Scanner(System.in);

        double number, result;
        int counter = 1;

        System.out.print("Bölünen sayıyı giriniz : ");
        result = inp.nextDouble();

        do {
            System.out.print(counter + ". bölen sayı : ");
            number = inp.nextDouble();
            if (number == 0) {
                System.out.println("Bölen sıfır olamaz.");
                continue;
            }
            counter++;
            result /= number;

        } while (number != 1);

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner inp = new Scanner(System.in);

        int base, exp, result = 1;
        System.out.print("Taban değerini giriniz : ");
        base = inp.nextInt();

        System.out.print("Üs değerini giriniz : ");
        exp = inp.nextInt();

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner inp = new Scanner(System.in);

        int number, result;
        do {
            result = 1;
            System.out.print("Faktöriyelini almak istediğiniz sayıyı giriniz : ");
            number = inp.nextInt();
            if (number < 0) {
                break;
            }
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            System.out.println("Sonuç : " + result);
            System.out.println("Menüye dönmek için negatif bir sayı giriniz.");

        } while (number >= 0);
    }

    static void mod() {
        Scanner inp = new Scanner(System.in);

        int n1, n2, result;
        do {
            System.out.print("Bölünen sayıyı giriniz : ");
            n1 = inp.nextInt();
            if (n1 == 0) {
                break;
            }

            System.out.print("Bölen sayıyı giriniz : ");
            n2 = inp.nextInt();
            if (n2 == 0) {
                break;
            }

            result = n1 % n2;
            System.out.println("Kalan : " + result);
            System.out.println("Menüye dönmek için bölünen veya bölen değerini sıfır giriniz.");

        } while (n1 != 0 && n2 != 0);

    }
    static void rectangle(){
        Scanner inp = new Scanner(System.in);

        int side1, side2 ;

        System.out.print("Birinci kenar uzunluğunu giriniz : ");
        side1 = inp.nextInt();

        System.out.print("İkinci kenar uzunluğunu giriniz : ");
        side2 = inp.nextInt();

        System.out.println("Çevre : " + 2*(side1 + side2));
        System.out.println("Alan : " + side1*side2);

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int choice;

        String menu = "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- Çıkış Yap";

        do {
            System.out.println("============================");
            System.out.println(menu);
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
            choice = inp.nextInt();

            switch (choice) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                default:
                    System.out.println("Lütfen menüde tanımlanan seçeneklerden birini seçiniz. ");
            }
        } while (choice != 0);
        System.out.println("Görüşmek üzere !");
    }
}
