package desafioCapgemini.questao01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		List<String> degraus = new ArrayList<>();

		System.out.print("Digite a quantidade de vezes, para montar uma escada de *: ");
		int qtdDegraus = numero.nextInt();

		for (int i = 0; i < qtdDegraus; i++) {
			degraus.add(" ".repeat(qtdDegraus - i) + "*".repeat(i + 1));
		}

		for (String d : degraus) {
			System.out.println(d);
		}

	}

}
