package vehiculos;

public class Pais {
	
	private String nombre;
	
	public Pais() {
		this("Japon");
	}
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	public static Pais paisMasVendedor() {
		return Vehiculo.masVentasPais();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
