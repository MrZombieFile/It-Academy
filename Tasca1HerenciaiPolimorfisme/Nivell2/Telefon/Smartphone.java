package Tasca1HerenciaiPolimorfisme.Nivell2.Telefon;

import Tasca1HerenciaiPolimorfisme.Nivell2.Telefon.Caracteristiques.Camera;
import Tasca1HerenciaiPolimorfisme.Nivell2.Telefon.Caracteristiques.Rellotge;

public class Smartphone extends Telefon implements Camera, Rellotge{
    @Override
    public void triggerAlarm() {
        System.out.println("Està sonant l'alarma");
    }

    @Override
    public void shoot() {
        System.out.println("S'està fent una foto");
    }
}
