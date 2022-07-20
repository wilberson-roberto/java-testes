import java.util.Scanner;

public class AtivJava08 {
    //Ler 10 valores e mostrar quantos desses valores lidos estão no intervalo
    // [10,20] (incluindo os valores 10 e 20 no intervalo) e quantos deles estão fora deste intervalo.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor = 0, dentro = 0, fora = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite um valor qualquer");
            valor = entrada.nextInt();

            if (valor >= 10 && valor <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }

        System.out.println("Dentro do intervalo 10 - 20:  " + dentro);
        System.out.println("Fora do intervalo 10 - 20:  " + fora);
    }
}

