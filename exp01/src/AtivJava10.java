import java.util.Scanner;

public class AtivJava10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade = 0, contador = 0;

        while (idade != 999) {
            System.out.println("Digite uma idade");
            idade = entrada.nextInt();
            contador++;
        }

        System.out.printf("A sala possui %d alunos e o aluno com maior idade é de %d", contador, idade);

        entrada.close();
    }
}
