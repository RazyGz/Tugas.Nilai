package Nilai;

import java.util.Scanner;

public class TotalBelanja {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Item 1");
        System.out.println("Nama : ");
        String Nama1 = input.next();

        System.out.println("Harga : ");
        int Harga1 = input.nextInt();

        System.out.println("Jumlah : ");
        int Jumlah1 = input.nextInt();


        System.out.println("Item2 : ");
        System.out.println("Nama : ");
        String Nama2 = input.next();

        System.out.println("Harga : ");
        int Harga2 = input.nextInt();

        System.out.println("Jumlah : ");
        int Jumlah2 = input.nextInt();

        int totalItem1 = Harga1 * Harga2;
        int totalItem2 = Harga2 * Harga1;
        System.out.println("Menghitung total... ");
        System.out.println("Item1");
        System.out.println("Total item1 : " + totalItem1);
        System.out.println("Item2");
        System.out.println("totalItem1: " + totalItem2);

        double diskon = (totalItem1 + totalItem2) * 5/100;
        double TotalBelanjasbm = totalItem1 + totalItem2;

        System.out.println("Diskon : " + diskon);
        double TotalBelanja = TotalBelanjasbm - diskon ;

        System.out.println("Total Belanja : " + TotalBelanja);
    }
}
