package vehiculos;

public class Camion extends Vehiculo{
	
	private int ejes;
	private static int cantidad;
	
	public Camion() {
		
		this("111AAA", 4, 100, "Camaro", 1000000, 1000, "FWD", new Fabricante(), 4);
		
	}
	
	public Camion(String placa, String nombre, int precio,int peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		
		this.ejes = ejes;
		Camion.cantidad += 1;
	}
	
	public Camion(String placa, int puertas, int velocidadMaxima, String nombre, int precio,int peso, String traccion, Fabricante fabricante, int ejes) {
		super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
		
		this.ejes = ejes;
		Camion.cantidad += 1;
	}
	
	public static int cantidad() {
		return Camion.cantidad;
	}
	
	public int getEjes() {
		return this.ejes;
	}
	
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

}
