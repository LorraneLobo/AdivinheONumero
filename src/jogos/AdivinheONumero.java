package jogos;

import java.util.Random;
import java.util.Scanner;

public class AdivinheONumero {

	//Analisando o palpite e comparando com o numero sorteado
	public static void dica(int palpite, int sorteado, int numeroTentativas) {
		if (palpite > sorteado) {
			System.out.println("Seu palpite é maior que o numero sorteado!");
		} else {
			if (palpite < sorteado) {
				System.out.println("Seu palpite é menor que o numero sorteado!");
			}else {
				System.out.println("PARABÉNS! Você acertou o número sorteado!");
				System.out.println("Você tentou " + numeroTentativas + " vezes antes de acertar.");
			}
		}

	}

	public static void main(String[] args) {

		int palpite = 0, numeroTentativas = 0, sorteado;
		
		Random geradorAleatorio = new Random();
		Scanner entrada = new Scanner(System.in);
		
		// Computador vai gerar um numero aleatório entre 0 e 999, adicionamos 1 para
		// ser entre 1 e 1000
		sorteado = geradorAleatorio.nextInt(1000) + 1;
		System.out.println("O número foi sorteado! :)");
		
		do {
			System.out.printf("\n---------------------------\n");
			System.out.println("Numero de tentativas: " + numeroTentativas);
			
			System.out.println("Qual o seu palpite? ");
			palpite = entrada.nextInt();
			
			numeroTentativas++;
			dica(palpite, sorteado, numeroTentativas);
			
		} while (palpite != sorteado);
	}
}
