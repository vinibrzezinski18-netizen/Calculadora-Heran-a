public class Soma extends Calculadora {


    public Soma(double valor1, double valor2){

        super(valor1,valor2);


    }

    public  void soma(){
        double resultado = valor1 + valor2;

        System.out.println("Resultado da Soma: " + resultado);
        System.out.println();

    }

}
