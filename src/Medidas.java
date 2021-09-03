
public class Medidas {
	
	Double peso;
	Double altura;
	Double imc;
	
	
	void imc() {
		
		imc = peso / Math.pow(altura, 2);
		
		System.out.printf("Seu IMC foi: %.2f Kg/m²", imc);
		
		if (imc < 18.5) {
			System.out.println("Magreza");	
		}
		
		else if (imc > 18.5 && imc < 24.9 ) {
			System.out.println("Normal");
		}
		
		else if (imc > 24.9 && imc < 30) {
			System.out.println("Sobrepeso");
		}
		
		else if (imc > 30) {
			System.out.println("Obesidade");
		}
		
	}
	
	
}
