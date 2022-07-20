import java.util.Scanner;

public class AtivJava09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor = 0, cont = 0, acumulador = 0;

        while (cont <= 10) {
            
            System.out.println("Digite qualquer valor");
            valor = entrada.nextInt();
            cont++;

            if (valor < 40) {
                acumulador += valor;
            }
        }

        System.out.println("Soma dos valores menores que 40 " + acumulador);
    }
}
