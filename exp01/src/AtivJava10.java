import java.util.Scanner;

// Faça um programa que leia a idade de vários alunos de uma turma. O programa vai parar quando for digitada a idade 999.
// No final, mostre quantos alunos existem na turma e qual é a maior idade do grupo.

public class AtivJava10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade = 0, contador = 0, maiorIdade = 0;

        do {
            System.out.println("Digite uma idade");
            idade = entrada.nextInt();
            contador++;

            if (idade > maiorIdade && idade != 999) {
                maiorIdade = idade;
            }

        } while (idade != 999);

        System.out.printf("A sala possui %d alunos e o aluno com maior idade é de %d", contador, maiorIdade);

        entrada.close();
    }
}
