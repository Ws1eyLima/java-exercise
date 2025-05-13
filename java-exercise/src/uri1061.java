import java.util.Scanner;

public class uri1061 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		sc.next();
		int diaInicio = sc.nextInt();
		
		int horaInicio = sc.nextInt();
		sc.next();
		int minutoInicio = sc.nextInt();
		sc.next();
		int segundoInicio = sc.nextInt();
		
		sc.next();
		int diaFim = sc.nextInt();
		
		int horaFim = sc.nextInt();
        sc.next(); 
        int minutoFim = sc.nextInt();
        sc.next(); 
        int segundoFim = sc.nextInt();
        
        int tempoInicio = diaInicio * 86400 + horaInicio * 3600 + minutoInicio * 60 + segundoInicio;
        int tempoFim = diaFim * 86400 + horaFim * 3600 + minutoFim * 60 + segundoFim;
        
        int duracao = tempoFim - tempoInicio;
		
        int dias = duracao / 86400;
        duracao = duracao % 86400;
        
        int horas = duracao / 3600;
        duracao %= 3600;
        
        int minutos = duracao / 60;
        int segundos = duracao % 60;
        
        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");

        
        
        
		sc.close();
	}

}
