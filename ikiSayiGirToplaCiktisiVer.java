package learnig10;

import javax.swing.JOptionPane;

public class ikiSayiGirToplaCiktisiVer {
	 public static void main(String[] args) {
		 double number1; // birinci gerçek sayý
		 double number2; // ikinci gerçek sayý
		 double toplam; // toplam rakam
		 number1 = Double.parseDouble(JOptionPane.showInputDialog("ilk gerçek sayýyý gir:"));
		 number2 = Double.parseDouble(JOptionPane.showInputDialog("ikinci gerçek sayýyý gir:"));
		 toplam = number1 + number2; // sayýlarý topla
		 JOptionPane.showMessageDialog(null,"Toplam ="+toplam ); // toplamý göster
	 }
	 
}
