package situacaoAprendizagem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] consumo = new int[12];
		String [] meses = {"janeiro","fevereiro","marco","abril","maio","junho","julho","agosto","setembro","outubro","novembro","dezembro"};
		for (int i = 0; i < consumo.length; i++) {
			System.out.println("Informe o consumo de energia eletrica do mês " + meses[i]);
			consumo[i] = input.nextInt();
		}
		
		System.out.println("O consumo total é " + total(consumo));
		System.out.println("O mês de maior consumo é o mês: " + meses[maior(consumo)] + ", consumindo: " + consumo[maior(consumo)]);
		System.out.println("O mês de menor consumo é o mês: " + meses[menor(consumo)]  + ", consumindo: " + consumo[menor(consumo)]);
		media(consumo);
		int media = media(consumo);
		System.out.println("a media de consumo é: " + media(consumo));
		System.out.println("A sua classificação é: " + classificao(media));
		
		

	}
	
	static int total(int consumo[]) {
		int total = 0;
		for (int i = 0; i < consumo.length; i++) {
			total += consumo[i];
		}
		return total;
	}
	
	static int maior(int consumo[]) {
		int maior = 0;
		int mes = 0;
		for (int i = 0; i < consumo.length; i++) {
			if (consumo[i] > maior) {
				maior = consumo[i];
				mes = i ;
			}
		}
		return mes;
	}
	
	static int menor(int consumo[]) {
		int menor = consumo[0];
		int mes = 0;
		for (int i = 0; i < consumo.length; i++) {
			if (consumo[i] < menor) {
				menor = consumo[i];
				mes = i ;
			}
		}
		return mes;
	}
	
	static int media(int consumo[]) {
		int media = 0;
		for (int i = 0; i < consumo.length; i++) {
			media += consumo[i];
		}
		return media/12;
	}
	
	static String classificao(int media) {
		if (media <= 150) {
			return "Consumo Baixo!";
		} else if (media > 150 && media <= 300) {
			return "Consumo moderado";
		} else if (media > 300) {
			return "Consumo elevado";
		}
		return "algo deu errado!";
	}

}
