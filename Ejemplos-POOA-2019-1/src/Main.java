import city.AreaUrbana;
import city.Habitante;

public class Main {

    public static void main(String[] args) {

        AreaUrbana areaUrbana = new AreaUrbana("Tijuana");

        Habitante a1 = new Habitante("Pepe", areaUrbana);

        areaUrbana.getHabitantes().add(a1);

        System.out.println(areaUrbana.toString());

        Habitante a2 = new Habitante("Juan", areaUrbana);

        areaUrbana.getHabitantes().add(a2);

        System.out.println(areaUrbana);
    }
}
