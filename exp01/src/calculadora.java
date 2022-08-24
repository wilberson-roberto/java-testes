public class calculadora implements Calculos {

    @Override
    public double somar(double x, double y) {
        
        return x + y;
    }

    @Override
    public void subtracao(double x, double y) {
        System.out.println(x - y);
        
    }

    @Override
    public double raiz(double x) {
        
        return Math.sqrt(x);
    }
    
}
