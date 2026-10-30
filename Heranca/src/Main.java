

public class Main {

    public static void main(String[] args ) {

        Soma somar = new Soma(10,20);
        somar.soma();

        Subtração subtrair = new Subtração (20,10);
        subtrair.subtracao();

        Multiplicacao multiplicar = new Multiplicacao(10, 10);
        multiplicar.multiplicacao();

        Divisao dividir = new Divisao(10 ,2);
                dividir.divisao();


    }


}