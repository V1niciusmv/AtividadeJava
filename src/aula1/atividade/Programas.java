package aula1.atividade;

import java.util.Scanner;

public class Programas {

	 public static void main(String[] args) {
		 
		 String nome;
		 Float peso = 0.0f;
		 Float altura;
		 Float IMC;
		 char genero;
		 int idade;
		 double metabolismo;
		 String opcao;
		 String continuar;
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Escolha uma opção (IMC/METABOLISMO):");
	     opcao = sc.next();
		 
		 switch (opcao) {
		 case "IMC":
		 System.out.println("Olá, qual seu nome:");
		 nome = sc.next();
		 
		 System.out.println("Bom " + nome + " Me diga seu peso:");
		 peso = sc.nextFloat();
		 
		 System.out.println("Me diga sua altura (,):");
		 altura = sc.nextFloat();
		 
		 IMC = peso / (altura * altura);
		 if (IMC < 19) {
			 System.out.println("O calculo do seu IMC foi: " + IMC + " esta abaixo do peso cuidado"); 
		 }else if (19 <= IMC && IMC < 25) {
			 System.out.println("O calculo do seu IMC foi: " + IMC + " esta com o peso normal"); 
		 }else if (25 <= IMC && IMC < 30) {
			 System.out.println("O calculo do seu IMC foi: " + IMC + " esta com sobrepeso"); 
		 }else if (30 <= IMC && IMC < 40) {
			 System.out.println("O calculo do seu IMC foi: " + IMC + " esta com a obesidade do tipo I"); 
		 }else if (IMC >= 40) {
			 System.out.println("O calculo do seu IMC foi: " + IMC + " esta com obesidade morbida"); 
		 } break;
		 
		 case "METABOLISMO":
		 System.out.println("Agora vamos calcular seu metabolismo basal, qual seu genero? (Digite F feminino ou M masculino)");
		 genero = sc.next().charAt(0);
		 
		 System.out.println("Qual sua idade:");
		 idade = sc.nextInt();
		 
		 if (genero == 'F') {
			if (idade == 19 && idade <= 30) {
		     metabolismo = (14.7 * peso) + 486.6;
		     	System.out.println("Você tem " + idade + " anos e está com o metabolismo de " + metabolismo + " Kcal");
			}else if (idade > 30 && idade <=60) {
				metabolismo = (8.7 * peso) + 829;
				System.out.println("Você tem " + idade + " anos e está com o metabolismo de " + metabolismo + " Kcal");
			}else{
				metabolismo = (10.5 * peso) + 596;
				System.out.println("Você tem " + idade + " anos e está com o metabolismo de " + metabolismo + " Kcal");
			}
		 } if (genero == 'M') {
			 if (idade == 19 && idade <= 30) {
			     metabolismo = (15.057 * peso) + 679;
			     	System.out.println("Você tem " + idade + " anos e está com o metabolismo de " + metabolismo + " Kcal");
				}else if (idade > 30 && idade <=60) {
					metabolismo = (11.6 * peso) + 879;
					System.out.println("Você tem " + idade + " anos e está com o metabolismo de " + metabolismo + " Kcal");
				}else{
					metabolismo = (13.5 * peso) + 487;
					System.out.println("Você tem " + idade + " anos e está com o metabolismo de " + metabolismo + " Kcal");
				} 
		     }  break;
         default:
             System.out.println("Opção inválida");
             break;
		 }
		 sc.close();
	 }
}
