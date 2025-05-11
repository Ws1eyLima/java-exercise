import java.util.Scanner;

public class uri1020 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int anos = N / 365;
		int resto = N % 365;
		
		int meses = resto / 30;
		int dias = resto % 30;
		
		System.out.printf("%d ano(s)%n", anos);
		System.out.printf("%d mes(es)%n", meses);
		System.out.printf("%d dia(s)%n", dias);
		
		sc.close();
	}

}
