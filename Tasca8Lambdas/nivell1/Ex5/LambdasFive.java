package Tasca8Lambdas.nivell1.Ex5;

public class LambdasFive implements GetValue{

    @Override
    public double getPiValue(double numero){
        return numero;
    }

    public static void main(String[] args){

        double numero = new LambdasFive().getPiValue(3.1415);
        System.out.println("The value of Pi is: " + numero);





    }

}
