package Tasca7Anotacions.nivell1.ex1;

import Tasca7Anotacions.nivell1.ex1.Treballadors.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DiaLaborable {


    ConductorAutobus joanPerezAutobus = new ConductorAutobus("Joan", "Perez", 16.58f, 0, 37.5f);
    ConductorMetro lluisPerezMetro = new ConductorMetro("Lluis", "Perez", 17.34f, 0, 37.5f);
    MantenimentAutobusos josepPerezMantenimentAutobusos = new MantenimentAutobusos("Josep", "Perez", 12.56f, 0, 37.5f);
    InstalladorFibraOptica manelPerezFibraOptica = new InstalladorFibraOptica("Manel", "Perez", 10.24f, 10, 40);
    RevisioGas antonioPerezRevisioGas = new RevisioGas("Antonio", "Perez", 22.20f, 140, 45);

    public void moviment(){
        ArrayList<Treballador> treballadors = new ArrayList<>();
        treballadors.add(joanPerezAutobus);
        treballadors.add(lluisPerezMetro);
        treballadors.add(josepPerezMantenimentAutobusos);
        treballadors.add(manelPerezFibraOptica);
        treballadors.add(antonioPerezRevisioGas);

        for (Treballador treballador : treballadors){
            treballador.treballar();
        }
    }

    public void moviment2(){
        Treballador[] aT =  {joanPerezAutobus, lluisPerezMetro, josepPerezMantenimentAutobusos, manelPerezFibraOptica, antonioPerezRevisioGas};
        for (int i = 0; i < aT.length; i++){
            aT[i].treballar();
        }

    }

    @SuppressWarnings( "deprecation" )
    public static void main (String[] args){

        DiaLaborable deuMaig = new DiaLaborable();

        deuMaig.moviment();
        System.out.println("\n");
        deuMaig.moviment2();

        deuMaig.josepPerezMantenimentAutobusos.imprimirT10();
        deuMaig.josepPerezMantenimentAutobusos.imprimirT10();

    }


}
