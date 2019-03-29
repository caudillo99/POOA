package city;

public class Edificio {

	private Ciudad ciudad;
	private String nombre;

	public Edificio(Ciudad ciudad, String nombre) {
		this.ciudad = ciudad;
		this.nombre = nombre;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Edificio{" +
				"ciudad=" + ciudad +
				", nombre='" + nombre + '\'' +
				'}';
	}
}