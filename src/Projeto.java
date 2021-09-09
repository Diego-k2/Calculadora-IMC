import java.util.Scanner;

public class Projeto {
	
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		Medidas dados = new Medidas();
	
		System.out.print("Iniciar ou Sair: " );
		String op = entrada.next();
		
		while (!op.toLowerCase().trim().equals("sair")) {
			System.out.print("Entre com o seu peso:" );
			dados.peso = entrada.nextDouble();
			System.out.print("Entre com sua altura em Metros: ");
			dados.altura = entrada.nextDouble();
				
			dados.imc();
			
			System.out.print("Continuar ou Sair: ");
			op = entrada.next();
		}
			
		entrada.close();
	}
	
}

