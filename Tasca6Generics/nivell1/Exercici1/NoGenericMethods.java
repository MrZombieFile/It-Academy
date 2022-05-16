package Tasca6Generics.nivell1.Exercici1;

import java.util.Date;

public class NoGenericMethods {

    Integer ahir;
    Integer avui;
    Integer dema;

    NoGenericMethods(Integer avui, Integer ahir, Integer dema){
        this.ahir = ahir;
        this.avui = avui;
        this.dema = dema;
    }

    public Integer getAhir() {
        return ahir;
    }

    public Integer getAvui() {
        return avui;
    }

    public Integer getDema() {
        return dema;
    }
}
