package Nilai;

import javax.swing.JOptionPane;

public class suhu1 {
    public static void main(String[] args) {
        
        String satuans = JOptionPane.showInputDialog("Masukkan satuan suhu yang mau dikonversi dari celcius \n(R untuk reamur, F untuk fahrenheit, K untuk kelvin): ");
        char satuan = satuans.toUpperCase().charAt(0);
        float celcius = Float.parseFloat(JOptionPane.showInputDialog("Masukkan suhu dalam bentuk celcius: "));

        switch(satuan) {
            case 'R':
            JOptionPane.showMessageDialog(null, celcius * 4/5 + " " + satuan);
            break;
        case 'F':
            JOptionPane.showMessageDialog(null, (celcius * 9/5) + 32 + " " + satuan);
            break;
        case 'K':
            JOptionPane.showMessageDialog(null, celcius + 273.15 + " " + satuan);
            break;
        default:
            JOptionPane.showMessageDialog(null, "Masukkan satuan yang benar!");
        }
    }
}
