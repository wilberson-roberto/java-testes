public class AtivJava01 {

// O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos
// (aplicados ao custo de fábrica) Supondo que o percentual do distribuidor seja de 28 e os impostos de 45 escrever um
// código para processar e mostrar o custo final ao consumidor.

    public static void main(String[] args) {
        double custoFabrica = 15.000;
        double porcentagemDist = custoFabrica * 0.28;
        double imposto = custoFabrica * 0.45;
        
        double valorFinal = custoFabrica + porcentagemDist + imposto;

        System.out.printf("O valor final do carro e de R$ %.2f", valorFinal);
    }

}
