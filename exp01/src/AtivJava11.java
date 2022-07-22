import java.util.Scanner;

// Fazer exemplo com operador ternário.

public class AtivJava11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor");
        int valor1 = entrada.nextInt();

        System.out.println("Digite outro valor");
        int valor2 = entrada.nextInt();

        String resultado = (valor1 <= valor2) ? "sim" : "não";
        System.out.printf("%d é menor ou igual %d? %n Resposta: %s", valor1, valor2, resultado);

        entrada.close();
    }
}
