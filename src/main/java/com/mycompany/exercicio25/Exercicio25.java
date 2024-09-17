package com.mycompany.exercicio25;
import javax.swing.JOptionPane;


//import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		// CONFIG
		int qtde = 2;
		
		
		
		// INPUT
		int vetor[] = new int[qtde];
		for (int i = 0; i < qtde; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número :" + i));
		}
		
		
		
		// PROCESS
		int soma = 0;
		for (int i = 0; i < qtde; i++) {
			soma = soma + vetor[i];
		}
		
		double media = soma / qtde;
		
		
		// OUTPUT
		JOptionPane.showMessageDialog(null, "A soma é: " + soma + "\nA média é " + media);
	}
}
