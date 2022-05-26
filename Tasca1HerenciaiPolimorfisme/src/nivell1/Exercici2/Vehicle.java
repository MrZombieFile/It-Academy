package nivell1.Exercici2;

public class Vehicle {

    public static void main(String[] args){

        Cotxe.frenar();
        //Es crida sense haver instanciat primer "Cotxe"

        Cotxe cotxe1 = new Cotxe("Serie3", 210);

        cotxe1.accelerar();
        //S'ha d'instanciar primer l'objecte cotxe per poder entrar/cridar al
        // mètode no static.


        //Ara si intentem entrar/canviar els atributs passa això:
        System.out.println(cotxe1.getMARCA()); //(es pot entrar)
        System.out.println(Cotxe.getMARCA());
        //"set marca" dona l'error Cannot assign a value to final variable 'MARCA'

        System.out.println(cotxe1.getModel());
        System.out.println(Cotxe.getModel());
        //Si a model, que és només private static fem un set podrem canviar el valor
        // de l'atribut
        cotxe1.setModel("Serie4");
        System.out.println(cotxe1.getModel());
        System.out.println(Cotxe.getModel());


        System.out.println(cotxe1.getPotencia());
        //Cotxe.getPotencia; No existeix perque no es static
    }


}
