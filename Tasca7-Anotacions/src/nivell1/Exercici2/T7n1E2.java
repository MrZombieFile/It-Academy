package nivell1.Exercici2;

public class T7n1E2 {

    @SuppressWarnings("deprecation")
    public static void main (String[] args){
        TreballadorOnline treballadorOnline = new TreballadorOnline("Miriam", "Jimenez", 12.53f);
        float souMensualTreballadorOnline = treballadorOnline.calcularSou(160f);

        TreballadorPresencial treballadorPresencial = new TreballadorPresencial("Aina", "Palacios", 12.53f);
        float souMensualTreballadorPresencial = treballadorPresencial.calcularSou(160f);

        Treballador treballador = new Treballador("Eugenia", "Perez", 12.53f);
        float souMensualTreballador = treballador.calcularSou(160f);

        System.out.println(souMensualTreballadorOnline);
        System.out.println(souMensualTreballadorPresencial);
        System.out.println(souMensualTreballador);


        treballadorOnline.calcularHoresTreballades(4f, 40f);
        treballadorPresencial.calcularHoresTreballades(4f, 40f);

    }

}
