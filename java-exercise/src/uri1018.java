import java.util.Locale;
import java.util.Scanner;

public class uri1018 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		System.out.println(N);
		
		int[] valoresNotas = {100 , 50, 20, 10, 5, 2, 1};
		
		for (int valor : valoresNotas) {
			int qtd = N / valor;
			System.out.println(qtd + " nota(s) de R$ " + valor + ",00");
			N = N % valor;
		}
		
		sc.close();
	}

}
