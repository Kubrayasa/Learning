package learnig10;

import javax.swing.JOptionPane;

public class ikiSayiGirToplaCiktisiVer {
	 public static void main(String[] args) {
		 double number1; // birinci ger�ek say�
		 double number2; // ikinci ger�ek say�
		 double toplam; // toplam rakam
		 number1 = Double.parseDouble(JOptionPane.showInputDialog("ilk ger�ek say�y� gir:"));
		 number2 = Double.parseDouble(JOptionPane.showInputDialog("ikinci ger�ek say�y� gir:"));
		 toplam = number1 + number2; // say�lar� topla
		 JOptionPane.showMessageDialog(null,"Toplam ="+toplam ); // toplam� g�ster
	 }
	 
}
