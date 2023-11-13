package Nilai;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TagihanPLN {
    public static void main(String[] args) {
        int listrik = Integer.parseInt("JOptionPane.showinputDialog");
        int tarif = 0;

        if(listrik <= 50){
            tarif = 100;
        } else if (listrik <= 150){
            tarif = 150;
        } else if (listrik <= 250){
            tarif = 250;
        } else {
            tarif =300;
        }
        int rumus = listrik*tarif;
        int total = (rumus*20)/100;

        JOptionPane.showConfirmDialog(null,"Total Biaya Pemakaian Yang Harus Dibayarkan adalah Rp " + String.format("&,d",total)+ "\nTotal Pemakaian Listrik adalah "+listrik+" kwh");
    }
}
