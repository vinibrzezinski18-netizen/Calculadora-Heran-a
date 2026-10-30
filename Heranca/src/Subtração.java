public class Subtração extends Calculadora {

    public Subtração(double valor1, double valor2){

        super(valor1,valor2);


    }

    public  void subtracao(){
        double resultado = valor1 - valor2;

        System.out.println("Resultado da subtrair :" + resultado);


    }

    }


