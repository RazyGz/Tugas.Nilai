package Nilai;

import java.util.Scanner;

public class TipeDataDanOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("==Kartika==");
        System.out.println("1. DSP\n2. SPP\n 3. Pendaftaran\n pilih : ");
        String pilih = scan.nextLine();
        System.out.println("Masukkan DSP : ");
        int DSP = scan.nextInt();
        System.out.println("Masukkan SPP: ");
        int SPP = scan.nextInt();
        System.out.println("Masukkan pendaftaran: ");
        int pendaftaran = scan.nextInt();
        System.out.println("Masukkan hasil DSP dan Potongan : ");
        int HasilPerselisihan = scan.nextInt();
        int hasil =162000;
        
        // Kartika
        if (pilih.equalsIgnoreCase("DSP,SPP,Pendaftaran")){
            hasil = DSP + SPP +pendaftaran ;
            }else {
                hasil =(DSP + SPP + pendaftaran) - HasilPerselisihan ;
            }
            System.out.println("Hasil : "+hasil);
    }
}
