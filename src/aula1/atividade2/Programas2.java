package aula1.atividade2;

import java.util.Scanner;

public class Programas2 {

	public static void main (String[] args) {
		
		double notas = 0;
		String escolhas;
		int[] numero = new int[10];
		int[] numeroInteiro = new int[100];
		
		/* Escreva um algoritmo em Java que solicite 5 notas e realize o
		 *  calculo da media aritmetica ao termino da execucao.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha de 1 a 8 numero:");
		escolhas = sc.next();
		
		switch (escolhas) {
		case "1":
		System.out.println("Por favor me de 5 notas:");
		notas += sc.nextDouble();
		notas += sc.nextDouble();
		notas += sc.nextDouble();
		notas += sc.nextDouble();
		notas += sc.nextDouble();
		
		double media = notas / 5;
		System.out.println("Essa é sua media aritimetica: " + media);
		break;
		
	 /* Dada a entrada de 10 inteiros em sequência, realize a impressao 
	  * da entrada inicial de forma inversa.
	  */
		case "2":
		System.out.println("Pfvr digite 10 numeros inteiros:");
		
		for (int i=0; i < 10; i++) {
			numero[i] = sc.nextInt();
		}
		 System.out.println("Entrada inversa:");
         for (int i = 9; i >= 0; i--) {
             System.out.print(numero[i] + " ");
         }
         break;
         
         /* Crie um algoritmo que preencha um Array com 100 numeros inteiros aleatoriamente e imprima os
         elementos. Alem disso, deve-se realizar a impressao inversa tambem.*/
         
		case "3":
		System.out.println("100 numeros inteiros aleatoriamente, impressos inversos:");
		
		for (int i=0; i < 100; i++) {
			int numeroAleatorio = (int) (Math.random()* 100) + 1;
			numeroInteiro[i] = numeroAleatorio;
		}
		System.out.println("Entrada iversa:");
		for (int i= numeroInteiro.length - 1; i >=0; i--) {
				System.out.print(numeroInteiro[i] + " ");
		}break;
		
		/*Crie um algoritmo que preencha um Array com 100 n ́umeros inteiros aleatoriamente e imprima os
		elementos num ́ericos que sejam primos.*/
		
		case "4":
		    System.out.println("100 numeros inteiros aleatoriamente, impressos apenas os primos:");

		    for (int i = 0; i < 100; i++) {
		        int numeroAleatorio = (int) (Math.random() * 100) + 1;
		        numeroInteiro[i] = numeroAleatorio;
		    }
		    System.out.println("Numeros primos:");
		    for (int i = 0; i < numeroInteiro.length; i++) {
		        int numeroAtual = numeroInteiro[i];
		        boolean ehPrimo = true;

		        for (int j = 2; j < numeroAtual; j++) {
		            if (numeroAtual % j == 0) {
		                ehPrimo = false;
		                break;
		            }
		        }
		        if (ehPrimo) {
		            System.out.print(numeroAtual + " ");
		        }
		    }break;
		   
	/*Crie um algoritmo que preencha um Array com 100 n ́umeros inteiros aleatoriamente e imprima os
		elementos num ́ericos que sejam  ́ımpares. */
	
		case "5":
		System.out.println("100 numeros inteiros aleatoriamente, impressos apenas os impares:");
		
		for (int i=0; i < 100; i++) {
			int numeroAleatorio = (int) (Math.random()* 100) + 1;
			numeroInteiro[i] = numeroAleatorio;
		}
		System.out.println("Sainda dos impares:");
		for (int i= 0; i < numeroInteiro.length; i++){
			if (numeroInteiro[i] % 2 !=0) {
				System.out.print(numeroInteiro[i] + " ");
			}
		}break;	
		
		/*Crie um algoritmo que preencha um Array com 100 n ́umeros inteiros aleatoriamente e imprima os
		elementos num ́ericos que sejam pares. */
		
		case "6":
		System.out.println("100 numeros inteiros aleatoriamente, impressos apenas os pares:");
			
			for (int i=0; i < 100; i++) {
				int numeroAleatorio = (int) (Math.random()* 100) + 1;
				numeroInteiro[i] = numeroAleatorio;
			}
			System.out.println("Sainda dos pares:");
			for (int i= 0; i < numeroInteiro.length; i++){
				if (numeroInteiro[i] % 2 ==0) {
					System.out.print(numeroInteiro[i] + " ");
				}
			}break;	
			
		/*Crie um algoritmo que preencha um Array com 100 n ́umeros inteiros aleatoriamente e imprima o maior
		e menor elemento.*/
		
		case "7":
			System.out.println("100 numeros inteiros aleatoriamente, impressos apenas o maior e menor valor:");
				for (int i=0; i < 100; i++) {
					int numeroAleatorio = (int) (Math.random()* 100) + 1;
					numeroInteiro[i] = numeroAleatorio;
				}
					 int menor = numeroInteiro[0];
					 int maior = numeroInteiro[0];

				for (int i = 1; i < numeroInteiro.length; i++) {
				     if (numeroInteiro[i] < menor) {
					     menor = numeroInteiro[i];
				   } else if (numeroInteiro[i] > maior) {
					     maior = numeroInteiro[i];
					  } 
				}
				System.out.println (maior);
				System.out.println (menor);
				break;
				
		/*Crie um algoritmo que preencha um Array com 100 numeros inteiros aleatoriamente e realize o calculo
		da media aritmetica. */
				
		case "8":
			System.out.println("100 numeros inteiros aleatoriamente, calculando a media aritimetica:");
			double calculo = 0;
			
				for (int i=0; i < 100; i++) {
					int numeroAleatorio = (int) (Math.random()* 100) + 1;
					numeroInteiro[i] = numeroAleatorio;
					calculo += numeroInteiro[i];
				}
				double resultado = calculo / 100; 
				System.out.println(resultado);
				break;			
				
  }
		sc.close();
}
}

