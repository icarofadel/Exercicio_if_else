package ExercicioMod10;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		
		System.out.println("Digite a nota da primeira matéria");
		int nota1 = s.nextInt();
		System.out.println("Digite a nota da segunda matéria");
		int nota2 = s.nextInt();
		System.out.println("Digite a nota da terceira matéria");
		int nota3 = s.nextInt();
		System.out.println("Digite a nota da quarta matéria");
		int nota4 = s.nextInt();
		
		int soma = nota1+nota2+nota3+nota4;
		
		int media = soma / 4;
		String mediaSt = getMedia(media);
		System.out.println(mediaSt);
	}

		private static String getMedia (int media) {
		// TODO Auto-generated method stub
				if (media >= 7 ) {
					return "O Aluno foi aprovado";
				} else if (media >= 5) {
					return "O Aluno está de recuperação";
				} else {
					return "O Aluno está reprovado";
				}
	}

	}

