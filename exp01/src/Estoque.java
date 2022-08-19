public class Estoque {
    double preco;
    private int quantidade;

    public void setPreco(double x) {
        this.preco = x;
    }

    public double getPreco() {
        return preco;
    }

    public double Total_Prod() {
        double totalEstoque = preco * quantidade;
        return totalEstoque;
    }
    public void Add_Produto(int qtd) {
        quantidade += qtd;
    }
    public void Remover_Produto(int qtd) {
        quantidade -= qtd;
    }
}
