public class principal {

     public static void main(String[] args) { // Carro

        // Carro gol = new Carro();

        // gol.modelo = "2022";
        // gol.placa = "abc1234";
        // gol.acelerar();
        // gol.frear();


        // Caixa caixa01 = new Caixa();

        // caixa01.depositar(700);
        // System.out.println(caixa01.extrato());


        Conversor conversor01 = new Conversor();

        double x = conversor01.Valor_Convertido(200, "euro");
        double y = conversor01.Valor_Convertido(200, "dollar");
        System.out.printf("O Valor em convertido em Dollar é de $ %.2f %n", x);
        System.out.printf("O Valor em convertido em Euro é de $ %.2f", y);
    }
}
