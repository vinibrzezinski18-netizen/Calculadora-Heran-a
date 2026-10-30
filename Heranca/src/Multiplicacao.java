public class Multiplicacao  extends Calculadora {

    public Multiplicacao(double valor1, double valor2){super(valor1, valor2);}


    public void multiplicacao() {
        double resultado = valor1 + valor2;
        System.out.println("A multiplicação dos valore são: " + resultado);
    }
}

