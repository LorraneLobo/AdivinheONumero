package exercicios;

import java.util.Scanner;

public class mediaTresProvas {

	//Calculando a média das notas recebidas
	public static float media(float... notas) {
		
		float media = 0;
		
		for(float nota: notas) {
			media += nota;
		}
		
		return media/notas.length;
	}
	
	//Descobrir a nota mais alta
	public static float maisAlta(float nota1, float nota2, float nota3) {
		if(nota1 >= nota2) {
			if(nota1 >= nota3) {
				return nota1;
			}else {
				if(nota2 >= nota3) {
					return nota2;
				}
			}
		}
		return nota3;
	}
	
	//Descobrir a nota mais baixa
	public static float maisBaixa(float nota1, float nota2, float nota3) {
		 if(nota1 <= nota2){
	            if(nota1 <= nota3)
	                return nota1;
	        }else{
	            if(nota2 <= nota3)
	                return nota2;
	        }
	        return nota3;
	}
	
	public static void main(String[] args) {
		
		float nota1,nota2,nota3;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor da 1° nota: ");
		nota1 = entrada.nextFloat();
		System.out.println("Digite o valor da 2° nota: ");
		nota2 = entrada.nextFloat();
		System.out.println("Digite o valor da 3° nota: ");
		nota3 = entrada.nextFloat();
		
		//Mostrando a media com todas as notas
		System.out.println("A média com as 3 notas seria:  "+media(nota1,nota2,nota3));
		//Mostrando a média com as duas notas mais altas
		System.out.println("A média com as duas notas mais altas seria: "+maisAlta(nota1, nota2, nota3));
		//Mostrando a média com a nota mais alta e a mais baixa
		System.out.println("A média com a nota mais alta e a mais baixa seria: "+maisBaixa(nota1, nota2, nota3));
		
	}
}
