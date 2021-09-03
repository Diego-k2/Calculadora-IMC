import java.util.Scanner;

public class Projeto {
	
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		Medidas dados = new Medidas();
		
		System.out.print("Entre com o seu peso:" );
		dados.peso = entrada.nextDouble();
		System.out.print("Entre com sua altura em Metros: ");
		dados.altura = entrada.nextDouble();
		
		dados.imc();
		
		
		entrada.close();
		
		
	}
	
}

