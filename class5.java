package learning4;

import java.util.Scanner;

public class class5 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int bakiye = 1000;
		int islem;
		
		
		
		System.out.println("1:Bakiye Görüntüle");
		System.out.println("2:Para Yatýrma ");
		System.out.println("3: Para Çekme");
		System.out.println("4:Sistemden Çýkýþ");
		
		
		islem = scan.nextInt();
		
		
		switch(islem) {
		
		case 1:
			System.out.println("Bakiyeniz" + bakiye + " tl dir");
		
			break;
		
		case 2:
			
			System.out.println("Ne kadar yatýracaksýnýz?");
		
			int miktar = scan.nextInt();
		
			bakiye = bakiye + miktar; // bakiye+= miktar;
			System.out.println("Bakiyeniz" + bakiye + " tl dir");
		break;
		case 3:
			System.out.println("Ne kadar para çekeceksiniz?");
			
			miktar = scan.nextInt();
		
			bakiye = bakiye + miktar; // bakiye+= miktar;
			System.out.println("Bakiyeniz" + bakiye + " tl dir");
		break;
		
		case 4:
			System.out.println("Sistemden Çýkýþ Yapýlýyor ...");
			break;
			default:
				System.out.println("Geçersiz Ýþlem ");
			
		}
				
				
	}

}
