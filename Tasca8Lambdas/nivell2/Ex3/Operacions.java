package Tasca8Lambdas.nivell2.Ex3;

public class Operacions{

    Operacio resultat = new Operacio(){
        @Override
        public double operacio(String operacio, double operand1, double operand2 ) {
            switch (operacio.toLowerCase()){
                case "multiplicacio":
                    return operand1 * operand2;
                case "divisio":
                    return operand1 / operand2;
                case "suma":
                    return operand1 + operand2;
                case "resta":
                    return operand1 - operand2;
            }



            return 0;
        }
    };




}
