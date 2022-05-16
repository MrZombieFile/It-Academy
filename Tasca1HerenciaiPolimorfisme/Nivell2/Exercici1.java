package Tasca1HerenciaiPolimorfisme.Nivell2;

import Tasca1HerenciaiPolimorfisme.Nivell2.Telefon.Smartphone;

public class Exercici1 {
    public static void main (String[] args){
        Smartphone smartphone = new Smartphone();

        smartphone.shoot();
        smartphone.triggerAlarm();
        smartphone.call("617409822");
    }
}
