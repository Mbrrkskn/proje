package proje;
import java.util.Scanner;
public class hesapmak�nes� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner girdi=new Scanner(System.in);

		int birincisayi, ikincisayi;

		System.out.print("�lk say�y� giriniz:");

		birincisayi=girdi.nextInt();

		System.out.print("�kinci say�y� giriniz:");

		ikincisayi=girdi.nextInt();

		 

		int islem, sonuc;

		System.out.print("Toplama i�lemi i�in 1'e, ��karma i�lemi i�in 2'ye, �arpma i�in 3'e ve b�lme i�lemi i�in 4'e bas�n�z:");

		islem=girdi.nextInt();

		 

		if(islem==1)

		{

		  sonuc=birincisayi+ikincisayi;

		  System.out.printf("Toplama i�lemini se�tiniz; sonu�=%d", sonuc);

		}

		if(islem==2)

		{

		  sonuc=birincisayi-ikincisayi;

		  System.out.printf("��karma i�lemini se�tiniz; sonu�=%d", sonuc);

		}

		if(islem==3)

		{

		  sonuc=birincisayi*ikincisayi;

		  System.out.printf("�arpma i�lemini se�tiniz; sonu�=%d", sonuc);

		}

		if(islem==4)

		{

		  sonuc=birincisayi/ikincisayi;

		  System.out.printf("B�lme i�lemini se�tiniz; sonu�=%d", sonuc);
		}
	
	}
	
}