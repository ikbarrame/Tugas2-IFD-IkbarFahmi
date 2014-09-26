import java.util.Scanner;
class Faktorial{
	public static void main(String[] args){
	
	System.out.println("====================");
	System.out.println("=PROGRAM FAKTORIAL==");
	System.out.println("=Ikbar Nur Muhammad=");
	System.out.println("=====1127050071=====");
	System.out.println("=Fahmi Ahmad Juhary=");
	System.out.println("=====1127050052=====");
	System.out.println("====================");
	long limit;
	long faktorial=1;
	
		Scanner scn = new Scanner(System.in);
		System.out.print("Masukan Bilangan Faktorial? ");
		limit=scn.nextInt();
				for (int i=1; i <= limit; i++){
				faktorial=1;
					for (int faktor=2; faktor <=i; faktor++)
					faktorial *= faktor;
		System.out.println (i + "	"+ faktorial);
		}
	}
}