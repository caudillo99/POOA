package city;

import java.util.*;

public class AreaUrbana {

	private String nombre;

	private Vector<Habitante> habitantes = new Vector<Habitante>();

	public AreaUrbana(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vector<Habitante> getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(Vector<Habitante> habitantes) {
		this.habitantes = habitantes;
	}

	@Override
	public String toString() {
		return "AreaUrbana{" +
				"nombre='" + nombre + '\'' +
				", habitantes=" + habitantes +
				'}';
	}
}