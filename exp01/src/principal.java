import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class principal {

     public static void main(String[] args) {

        // Carro gol = new Carro(); // Carro

        // gol.modelo = "2022";
        // gol.placa = "abc1234";
        // gol.acelerar();
        // gol.frear();



        // Caixa caixa01 = new Caixa(); // Modelo de caixa

        // caixa01.depositar(700);
        // System.out.println(caixa01.extrato());



        // Conversor conversor01 = new Conversor(); // Conversor de moeda

        // double x = conversor01.Valor_Convertido(200, "euro");
        // double y = conversor01.Valor_Convertido(200, "dollar");
        // System.out.printf("O Valor em convertido em Dollar é de $ %.2f %n", x);
        // System.out.printf("O Valor em convertido em Euro é de $ %.2f", y);



        // Estoque produto = new Estoque(); // Estoque

        // System.out.println(produto.Total_Prod());

        // produto.Add_Produto(150);
        // produto.setPreco(10);
        // produto.getPreco();

        // System.out.println(produto.Total_Prod());
        // produto.Remover_Produto(40);
        // System.out.println(produto.Total_Prod());



        // BomDia dia1 = new BomDia(); // Bom dia

        // Scanner input = new Scanner(System.in);

        // System.out.println("Qual o seu nome?");
        // String nome = input.next();

        // System.out.println("Selecione 1 para dia, 2 tarde ou 3 noite?");
        // int frase = input.nextInt();

        // if (frase == 1) {
        //     dia1.setFrase("Bom dia, ");
        // } else if (frase == 2) {
        //     dia1.setFrase("Boa tarde, ");
        // } else if (frase == 3) {
        //     dia1.setFrase("Boa noite, ");
        // }

        // //dia1.setFrase("Bom dia, ");

        // System.out.println(dia1.getFrase() + nome);

        // input.close();



        // // Criando uma instancia da classe Maior
        // Maior maiorNumero = new Maior(); // Maior número

        // // chamando o método verificar do objeto maiorNumero
        // maiorNumero.verificar(17, 20);

        // // chamando o método mostrarMaior do objeto maiorNumero
        // maiorNumero.mostrarMaior();


        
        // Login logar = new Login(); // login - corrigir

        // Scanner input = new Scanner(System.in);
        
        // System.out.println("Crie um usuário e depois uma senha");
        // logar.cadastro(input.nextLine(), input.nextLine());
        // input.close();

        
        
        // // Animal
        // Animal dog = new Animal();
        // Animal cat = new Animal();

        // dog.alimentar();

        // for (int i = 1; i < 102; i++) {
        //     dog.andar();
        // }

        // dog.emitirSom("Au, au, auuuuuu....");

        // cat.alimentar();

        // for (int i = 1; i < 102; i++) {
        //     cat.andar();
        // }

        // cat.emitirSom("Miaaauuuuu...");



        calculadora calc = new calculadora(); // Calculadora

        System.out.println("A soma é de " + calc.somar(40, 50));
        
        System.out.print("A subtração é de ");
        calc. subtracao(50, 40);

        System.out.println("A raiz é de " + calc.raiz(50));

    }
}
