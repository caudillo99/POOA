package city;

import java.util.*;

public class Ciudad extends AreaUrbana {

    public Ciudad(String nombre) {
        super(nombre);
    }

	private Vector<Edificio> edificios = new Vector<Edificio>();

    public Vector<Edificio> getEdificios() {
        return edificios;
    }

    public void setEdificios(Vector<Edificio> edificios) {
        this.edificios = edificios;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "edificios=" + edificios +
                '}';
    }
}