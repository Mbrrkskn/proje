package proje;
import java.util.Scanner;
public class hesapmakýnesý {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner girdi=new Scanner(System.in);

		int birincisayi, ikincisayi;

		System.out.print("Ýlk sayýyý giriniz:");

		birincisayi=girdi.nextInt();

		System.out.print("Ýkinci sayýyý giriniz:");

		ikincisayi=girdi.nextInt();

		 

		int islem, sonuc;

		System.out.print("Toplama iþlemi için 1'e, çýkarma iþlemi için 2'ye, çarpma için 3'e ve bölme iþlemi için 4'e basýnýz:");

		islem=girdi.nextInt();

		 

		if(islem==1)

		{

		  sonuc=birincisayi+ikincisayi;

		  System.out.printf("Toplama iþlemini seçtiniz; sonuç=%d", sonuc);

		}

		if(islem==2)

		{

		  sonuc=birincisayi-ikincisayi;

		  System.out.printf("Çýkarma iþlemini seçtiniz; sonuç=%d", sonuc);

		}

		if(islem==3)

		{

		  sonuc=birincisayi*ikincisayi;

		  System.out.printf("Çarpma iþlemini seçtiniz; sonuç=%d", sonuc);

		}

		if(islem==4)

		{

		  sonuc=birincisayi/ikincisayi;

		  System.out.printf("Bölme iþlemini seçtiniz; sonuç=%d", sonuc);
		}
	
	}
	
}