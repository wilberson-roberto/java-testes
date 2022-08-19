

public class TesteJava01 {
    /*public static void main(String[] args) {
        int idade = 20;
        double salario = 0.0;
        String nome = "Wilberson Roberto";
        float comissao = 15;
        boolean status = true;
        double salarioFuncionario = 1500;

        System.out.println(idade);
    }*/

    /*
    public static void main(String[] args) {
        double a, b, c;
        a = 10000.5055;
        b = 15000.6066;
        c = a + b;

        //System.out.println("A soma dos valores: " + c);
        System.out.printf("A soma dos valores = %.2f", c);
    } */

    /*
    public static void main(String[] args) {
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    } */

    // %f = ponto flutuante
    // %d = inteiro
    // %s = texto
    // %n = quebra de linha

    /*
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite sua idade:");
        int idade = entrada.nextInt();

        if (idade < 12) {
            System.out.println("Você é uma criança");
        } else if (idade > 12 && idade <= 18) {
            System.out.println("Você é adolescente");
        } else if (idade > 18 && idade <= 59) {
            System.out.println("Você é adulto");
        } else if (idade >= 60) {
            System.out.println("Você é idoso");
        }

        entrada.close();
    } */

//     public static void main(String[] args) {
//         Scanner entrada = new Scanner(System.in);

//         System.out.println("Digite um número");
//         int valor = entrada.nextInt();

//         for (int i = 1; i <= 10; i++) {
//             System.out.println(valor + " x " + i + " = " + (valor * i));
//         }
//     }

        // public static void main(String[] args) { // Estrutura básica while
        //     int x = 1;

        //     while (x <= 10) { 
        //         System.out.println(x);
        //         x++;
        //     }
        // }

        // public static void main(String[] args) { // Estrutura básica Do While
        //     int x = 1;

        //     do {
        //         System.out.println(x);
        //         x++;
        //     } while (x <= 10);

        // }

        // public static void main(String[] args) {
        //     int valor = 1;

        //     for (int i = 1; i <= 10; i++) {
        //         System.out.println(valor + " x " + i + " = " + (valor * i));
        //     }
        // }

        // public static void main(String[] args) { // Exemplo switch
        //     String time = "São Paulo";

        //     switch (time) {
        //         case "Palmeiras":
        //         case "Santos": 
        //         case "São Paulo":
        //             System.out.println("Time do estado de São Paulo");
        //             break;

        //         case "Flamengo":
        //         case "Bota Fogo": 
        //             System.out.println("Time do estado de Rio de janeiro");
        //             break;
            
        //         default:
        //             System.out.println("Time fora do eixo Rio/São Paulo");
        //     }
        // }

         // public static void main(String[] args) { // Operador ternário
        //     int a = 3, b = 5;
        //     String valor = (a > b) ? "Verdadeiro" : "Falso";
        //     System.out.println(valor);
        // }

        // public static void main(String[] args) { // Conversor de moeda aprimorado
        //     Scanner entrada = new Scanner(System.in);

        //     int menu = 1;
        //     double valor = 0.0f;

        //     while (menu > 0) {
        //         if (menu == 1) {
        //             System.out.println("------------------------------------------------------------------------------------------");
        //             System.out.println("Qual valor deseja converter?");
        //             System.out.println("------------------------------------------------------------------------------------------");
        //             valor = entrada.nextDouble();
        //         }

        //         do {
        //             System.out.println("------------------------------------------------------------------------------------------");
        //             System.out.println("1 - Entrar com novo valor a ser convertido");
        //             System.out.println("------------------------------------------------------------------------------------------");
        //             System.out.println("Para converter o valor digitado:");
        //             System.out.println("2 - Converter para Dólar");
        //             System.out.println("3 - Converter para Euro");
        //             System.out.println("4 - Converter para Yene");
        //             menu = entrada.nextInt();
        //         } while (menu < 0 && menu > 3);

        //         switch (menu) {
        //             case 2:
        //                 System.out.println("------------------------------------------------------------------------------------------");
        //                 double conversorDolar = valor / 5.4082;
        //                 System.out.printf("R$ %.2f vale USD$ %.2f %n", valor, conversorDolar);
        //                 break;
        //             case 3:
        //                 System.out.println("------------------------------------------------------------------------------------------");
        //                 double conversorEur = valor / 5.4548;
        //                 System.out.printf("R$ %.2f vale EUR$ %.2f %n", valor, conversorEur);
        //                 break;
        //             case 4:
        //                 System.out.println("------------------------------------------------------------------------------------------");
        //                 double conversorJpy = valor / 0.03905;
        //                 System.out.printf("R$ %.2f vale JPY$ %.2f %n", valor, conversorJpy);
        //                 break;
        //             default:
        //                 break;
        //         }
        //     }
        //     entrada.close();
        // }
}


