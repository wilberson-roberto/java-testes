// Crie uma classe animal com os atributos e métodos gerais para as subclasses, crie uma classe cachorro herdando de animal e faça-o latir. Crie uma classe gato herdado de animal e faça-o miar. Faça os dois animais caminharem mostrando o número de passos de cada um. Observação: os animais só podem andar se estiverem alimentados, para isso crie um atributo para fazer essa condição. A cada 100 passos o animal deve ser alimentado, caso contrário ele não consegue andar.

public class Animal {
    private int nome;
    private int raca;
    private int numeroPatas = 0;
    private int passos = 0;
    private boolean alimentado = false;

    public void alimentar() {
        alimentado = true;
        passos = 0;
    }

    public void andar() {
        if (this.alimentado && this.passos < 100) {
            this.passos++;
            System.out.println("Andou " + this.passos + " passos.");
        } else {
            System.out.println("Alimente o animal");
        }
    }

    public void emitirSom(String som) {
        System.out.println("O animal emitiu um som: " + som);
    }

    public class dog extends Animal {

    }

    public class cat extends Animal {
        
    }
}
