import java.util.Locale;
import java.util.Scanner;

public class uri1017 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tempoGasto = sc.nextInt();
		int velocidadeMedia = sc.nextInt();
		
		double distancia = (double) tempoGasto * velocidadeMedia;
		double litrosUsados = distancia / 12;
		
		System.out.printf("%.3f%n", litrosUsados);
		
		sc.close();
	}

}
