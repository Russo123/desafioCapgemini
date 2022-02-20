package desafioCapgemini.questao03;

import java.util.Arrays;
import java.util.Scanner;

public class Questao03 {

	public static boolean validaAnagrama(String string1, String string2) {
		if (string1 == null || string2 == null) {
			return false;
		}
		if (string1.length() != string2.length()) {
			return false;
		}

		char[] stringTemporaria = string1.toCharArray();
		char[] stringTemporaria2 = string2.toCharArray();

		Arrays.sort(stringTemporaria);
		Arrays.sort(stringTemporaria2);

		return Arrays.equals(stringTemporaria, stringTemporaria2);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String palavra1;
		String palavra2;

		System.out.println("Digite a primeira palavra:");
		palavra1 = scan.next();

		System.out.println("Digite a segunda palavra:");
		palavra2 = scan.next();

		
		//StringBuilder palavraInvertida = new StringBuilder(palavra).reverse();

		if(validaAnagrama(palavra1, palavra2)) {
			System.out.println("As palavras " + palavra1 +" e " + palavra2 +
					" são um anagrama!");
		}else {
			System.out.println("As palavras " + palavra1 +" e " + palavra2  + " não são um anagrama!");
		}
	}
}
