import java.util.Locale;
import java.util.Scanner;

public class uri1008 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorHora = sc.nextDouble();
		
		double salario = horasTrabalhadas * valorHora;
		
		System.out.printf("NUMBER = %d%n", numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}
}
