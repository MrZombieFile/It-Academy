package Tasca6Generics.nivell3NoHoEntenc;

public class Generic {

    public <T> void metodeGeneric1(Telefon telefon){
        telefon.trucar();
    }

    public <T> Foto metodeGeneric2(Smartphone smartphone){
        Foto novaFoto = smartphone.ferFotos();
        return novaFoto;
    }
}
