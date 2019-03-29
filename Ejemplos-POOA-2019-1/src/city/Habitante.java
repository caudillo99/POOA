package city;

public class Habitante {

	private String name;

	private AreaUrbana areaUrbana;

	public Habitante(String name, AreaUrbana areaUrbana) {
		this.name = name;
		this.areaUrbana = areaUrbana;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AreaUrbana getAreaUrbana() {
		return areaUrbana;
	}

	public void setAreaUrbana(AreaUrbana areaUrbana) {
		this.areaUrbana = areaUrbana;
	}

	@Override
	public String toString() {
		return "Habitante{" +
				"name='" + name + '\'' +
				'}';
	}
}