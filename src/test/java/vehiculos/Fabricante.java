package vehiculos;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	
	public Fabricante() {
		this("Nissan", new Pais());	
	}
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		return Vehiculo.mayorFabricante();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Pais getPais() {
		return this.pais;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}

}
