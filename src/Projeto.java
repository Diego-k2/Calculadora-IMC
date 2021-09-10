import java.util.Scanner;

public class Projeto {
	
	public static void main (String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		Medidas dados = new Medidas();
	
		System.out.print("1-Iniciar ou 2-Sair: " );
		int op = entrada.nextInt();
		
		while (op != 2 ) {
			
			System.out.print("Entre com o seu peso:" );
			dados.peso = entrada.next().replace(",", ".");
			System.out.print("Entre com sua altura em Metros: ");
			dados.altura = entrada.next().replace("," , ".");
			
			
			System.out.printf("O seu IMC é: %.2f %n",dados.retornaImc());
			System.out.printf("O seu status é: %s%n", dados.retornaFisico());
				
			
			System.out.print("1-Continuar ou 2-Sair: ");
			op = entrada.nextInt();
		
	}
			
		entrada.close();
	
		
	}
	
}

