package desafioCapgemini.questao02;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao02 {

	public static boolean verficaSenha(String str) {

		String regex = "^(?=.*[a-z])(?=." + "*[A-Z])(?=.*\\d)" + "(?=.*[-+_!@#$%^&*., ?]).+$";

		Pattern p = Pattern.compile(regex);

		if (str == null) {
			System.out.println("No");
			return false;
		}

		Matcher m = p.matcher(str);

		if (m.matches())
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int opcao = 0;
		boolean sucesso; 
		
		do {
			System.out.println("Digite Usuario e Senha!\n");

			System.out.print("Login:");
			String login = scan.next();

			System.out.print("Senha:");
			String senha = scan.next();

			if (senha.length() >= 6 && verficaSenha(senha)) {
				sucesso = true;
				System.out.println(login + ", sua senha é forte!");
			} else {
				sucesso = false;
				System.out.println("Sua senha contém " + senha.length() + " caracteres porém, ");
				System.out.println(login + ", sua senha é FRACA!\n\nEla precisa conter:" + "\nMínimo 6 caracteres\n"
						+ "Mínimo 1 digito\n" + "Mínimo 1 letra minúscula\n" + "Mínimo 1 letra maiúscula\n"
						+ "Mínimo 1 caractere especial\n\n" + "Digite:\n1- Tentar novamente\n2- Sair");

				opcao = scan.nextInt();
			}
		} while (opcao != 2 && sucesso == false);
	}
}
