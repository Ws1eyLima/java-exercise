import java.util.Locale;
import java.util.Scanner;

public class uri1021 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		int centavos = (int) Math.round(valor * 100);
		
		int [] notas = {10000, 5000, 2000, 1000, 500, 200};
		int[] moedas = {100, 50, 25, 10, 5, 1};
		
		System.out.println("NOTAS:");
		for (int nota : notas) {
			int qtd = centavos / nota;
			System.out.printf("%d nota(s) de R$ %.2f%n", qtd, nota / 100.0);
			centavos = centavos % nota;
		}
		
		System.out.println("MOEDAS:");
		for (int moeda : moedas) {
			int qtd = centavos / moeda;
			System.out.printf("%d moeda(s) de R$ %.2f%n", qtd, moeda / 100.0);
			centavos = centavos % moeda;
		}
		
		
		sc.close();
	}

}
