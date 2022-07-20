import java.util.Scanner;

// Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O aluguel  de um carro custa R$ 90,00 por dia para carro popular e R$ 150,00
// por dia para carro de luxo. Além disso, o cliente paga por KM percorrido. Faça um programa que leia o tipo de carro alugado (popular ou luxo),
// quantos dias de aluguel e quantos KM foram percorridos. No final mostre o preço a ser pago de acordo com a tabela a seguir:

// - Carros populares (aluguel de R$ 90,00 por dia)
// até 100km percorridos: R$ 0,20 por km
// acima de 100km percorridos: R$ 0,10 por km

// - carros de luxo (aluguel de R$ 150,00 por dia)
// até 200km percorridos: R$ 0,30 por km
// acima de 200km percorridos: R$ 0,25 por km

public class AtivJava06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha 1 para carro Popular ou 2 para carro de Luxo");
        int carroTipo = entrada.nextInt();

        System.out.println("Por quantos dias quer alugar?");
        int diasAluguel = entrada.nextInt();

        System.out.println("Quantos km percorreu?");
        double kmPercorrido = entrada.nextDouble();

        double totalPagarPopularAte100 = kmPercorrido * 0.20 + diasAluguel * 90.00;
        double totalPagarPopularAcima100 = kmPercorrido * 0.10 + diasAluguel * 90.00;

        double totalPagarLuxoAte200 = kmPercorrido * 0.30 + diasAluguel * 150.00;
        double totalPagarLuxoAcima200 = kmPercorrido * 0.25 + diasAluguel * 150.00;

        if (carroTipo == 1 && kmPercorrido <= 100) {
            System.out.println("O veículo escolhido foi " + carroTipo + ", foi alugado por " + diasAluguel + " dias e percorreu por " + kmPercorrido + "km. O total a pagar é de R$ " + totalPagarPopularAte100);
        } else if (carroTipo == 1 && kmPercorrido > 100) {
            System.out.println("O veículo escolhido foi " + carroTipo + ", foi alugado por " + diasAluguel + " dias e percorreu por " + kmPercorrido + "km. O total a pagar é de R$ " + totalPagarPopularAcima100);
        } else if (carroTipo == 2 && kmPercorrido <= 200) {
            System.out.println("O veículo escolhido foi " + carroTipo + ", foi alugado por " + diasAluguel + " dias e percorreu por " + kmPercorrido + "km. O total a pagar é de R$ " + totalPagarLuxoAte200);
        } else if (carroTipo == 2 && kmPercorrido > 200) {
            System.out.println("O veículo escolhido foi " + carroTipo + ", foi alugado por " + diasAluguel + " dias e percorreu por " + kmPercorrido + "km. O total a pagar é de R$ " + totalPagarLuxoAcima200);
        }

        entrada.close();
    }
}
