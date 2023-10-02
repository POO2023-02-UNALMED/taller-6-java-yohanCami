package vehiculos;

public class Camioneta extends Vehiculo{
	
	private boolean volco;
	private static int cantidad;
	
	public Camioneta() {
		this("111AAA", 4, 100, "Camaro", 1000000, 1000, "FWD", new Fabricante(), false);
	}
	
	public Camioneta(String placa, int puertas, String nombre, int precio,int peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		
		this.volco = volco;
		Camioneta.cantidad += 1;
	}
	
	public Camioneta(String placa, int puertas, int velocidadMaxima, String nombre, int precio,int peso, String traccion, Fabricante fabricante, boolean volco) {
		super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
		
		this.volco = volco;
		Camioneta.cantidad += 1;
	}
	
	public static int cantidad() {
		return Camioneta.cantidad;
	}
	
	public boolean isVolco() {
		return this.volco;
	}
	
	public void setVolco(boolean volco) {
		this.volco = volco;
	}

}
