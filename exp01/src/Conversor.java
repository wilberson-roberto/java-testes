public class Conversor {
    public double Valor_Final = 0;

    public double Valor_Convertido(double Valor_Real, String Escolha) {
        if (Escolha == "euro") {
            Valor_Final = Valor_Real / 5.25;
        } else if (Escolha == "dollar") {
            Valor_Final = Valor_Real / 5.11;
        }

        return Valor_Final;
    }
}
