package Nilai;

import java.util.Scanner;

public class java2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


System.out.println("Silahkan masukkan nama: "); String nama = input.nextLine();

System.out.println("Silahkan masukkan nilai: ");

int nilai = input.nextInt();

String predikat = null;
String kategori = null;
if (nilai > 95 && nilai <=100 ) {

predikat = "A+"; kategori ="Sangat Baik";
}
else if (nilai >90 && nilai <=95 ) {

predikat = "A"; kategori = "Sangat Baik";
}
else if (nilai >85 && nilai <=90 ) {
predikat = "B+";
kategori ="Baik";
} else if (nilai > 80 && nilai <=85 ) {
predikat ="B"; kategori ="Baik";
}
else if (nilai > 75 && nilai <=80 ) {
predikat = "C+";
kategori ="Cukup";
}
else if (nilai >70 && nilai <=75) {
predikat ="C"; kategori = "Cukup";
} 
else if (nilai > 60 && nilai <=70 ){
predikat = "D+"; kategori = "Kurang";
}

System.out.println("Nama: " + nama);
System.out.println("Nilai:" + nilai);
System.out.println(predikat);
System.out.println(kategori);
    }
}
