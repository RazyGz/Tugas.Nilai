package Nilai;

import java.util.Scanner;
import java.util.StringJoiner;

public class percabangan2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("==Balok==");
        System.out.println("1.  Luas permukaan\n2. Volume\n pilih : ");
        String pilih = scan.nextLine();
        System.out.println("Masukkan Panjang : ");
        int Panjang = scan.nextInt();
        System.out.println("Masukkan Lebar: ");
        int Lebar = scan.nextInt();
        System.out.println("Masukkan Tinggi: ");
        int Tinggi = scan.nextInt();
        int hasil =0;

        // switch (pilih) {
        //     case 1:
        // //proses luas permukaan
        // hasil = 2* (Panjang*Lebar)+(Lebar*Tinggi)+(Tinggi*Panjang);
        // case 2:
        // //proses volume
        // hasil = Panjang*Tinggi*Lebar;
        // break;
        // }

        if (pilih.equalsIgnoreCase("volume")){
        hasil = Panjang*Lebar*Tinggi;
        }else {
            hasil = 2*(Panjang*Lebar)+(Lebar*Tinggi)+(Tinggi*Panjang);
        }
        System.out.println("Hasil : "+hasil);
    }
}
