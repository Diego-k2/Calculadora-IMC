import java.util.Scanner;

public class Medidas {
	
	String peso;
	String altura;
	
	Scanner entrada = new Scanner (System.in);
	
	
	double getPeso(){
		double pesoG = Double.parseDouble(peso);
		return pesoG;
	}
	
	double getAltura(){
		double alturaG = Double.parseDouble(altura);
		return alturaG;
	}
	
	double retornaImc(){
		double imcalculo = getPeso() / Math.pow(getAltura(), 2);
		return imcalculo;	
	}

	String retornaFisico() {
		
			double imcalculo = getPeso() / Math.pow(getAltura(), 2);
			String status = "";
			
			if (imcalculo < 18.5) {
				status = "Magreza";	
			}else if (imcalculo > 18.5 && imcalculo < 24.9 ) {
				status = "Normal";
			}else if (imcalculo > 24.9 && imcalculo < 30) {
				 status = "Sobrepeso";
			}else if (imcalculo > 30) {
				 status = "Obesidade";
			}
			
			return status;
	}
	
}
