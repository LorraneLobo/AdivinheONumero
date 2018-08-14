package jogos;

import java.util.Random;

public class AdivinheONumero {

	
	public static void main(String[] args) {
		
		Random geradorAleatorio = new Random();
		
		//Computador vai gerar um numero aleatório entre 0 e 999, adicionamos 1 para ser entre 1 e 1000
		int sorteado = geradorAleatorio.nextInt(1000)+1;
		
	}
}
