import java.util.Scanner;

public class AtivJava04 {

// Desenvolver um programa que leia o número de um
// funcionário, seu número de horas trabalhadas, o valor que recebe por
// hora e calcular o salário desse funcionário A seguir, mostre o número e
// o salário do funcionário, com duas casas decimais.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite o número do funcionário");
        int numFuncionario = entrada.nextInt();
        System.out.println("Digite as horas trabalhadas");
        int horasTrabalhadas = entrada.nextInt();
        double salarioHora = 22;

        // Processamento
        double salarioTotal = salarioHora * horasTrabalhadas;

        // Saída de dados
        System.out.printf("O empregado de número %d trabalhou %d horas e recebeu R$ %.2f de salário", numFuncionario, horasTrabalhadas, salarioTotal);

        entrada.close();
    }
}
