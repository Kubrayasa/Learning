package learning4;

import java.util.Scanner;

public class class5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int bakiye = 1000;
		int islem;
		
		
		
		System.out.println("1:Bakiye G�r�nt�le");
		System.out.println("2:Para Yat�rma ");
		System.out.println("3: Para �ekme");
		System.out.println("4:Sistemden ��k��");
		
		
		islem = scan.nextInt();
		
		
		switch(islem) {
		
		case 1:
			System.out.println("Bakiyeniz" + bakiye + " tl dir");
		
			break;
		
		case 2:
			
			System.out.println("Ne kadar yat�racaks�n�z?");
		
			int miktar = scan.nextInt();
		
			bakiye = bakiye + miktar; // bakiye+= miktar;
			System.out.println("Bakiyeniz" + bakiye + " tl dir");
		break;
		case 3:
			System.out.println("Ne kadar para �ekeceksiniz?");
			
			miktar = scan.nextInt();
		
			bakiye = bakiye + miktar; // bakiye+= miktar;
			System.out.println("Bakiyeniz" + bakiye + " tl dir");
		break;
		
		case 4:
			System.out.println("Sistemden ��k�� Yap�l�yor ...");
			break;
			default:
				System.out.println("Ge�ersiz ��lem ");
			
		}
				
				
	}

}
