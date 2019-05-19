package CalculandoNotas;

import java.util.Scanner;

public class CalculandoNotas {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		System.out.println("Informe primeira nota"); 
		double nota1 = scan.nextDouble();

		System.out.println("Informe segunda nota"); 
		double nota2 = scan.nextDouble();

		System.out.println("Informe terceira nota");  
		double nota3 = scan.nextDouble();

		System.out.println("Informe quarta nota"); 
		double nota4 = scan.nextDouble();

		double media =  nota1 + nota2 +  nota3 +  nota4 ;
		double total = media / 4;
		if (media >= 7){
			System.out.println(" Todas notas foram aprovada  " + ","+ " média é "+ total);
		}else {
			System.out.println(" Sua notas são insuficientes, reprovada " +","+" média é" + total);
		}
	}
}
