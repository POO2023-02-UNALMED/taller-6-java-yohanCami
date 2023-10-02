package vehiculos;

public class Automovil extends Vehiculo{
	
	private int puestos;
	private static int cantidad;
	
	public Automovil(){
		this("111AAA", 4, 100, "Camaro", 1000000, 1000, "FWD", new Fabricante(), 4);
	}
	
	public Automovil(String placa, String nombre, int precio,int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		
		this.puestos = puestos;
		Automovil.cantidad += 1;
	}
	
	public Automovil(String placa, int puertas, int velocidadMaxima, String nombre, int precio,int peso, String traccion, Fabricante fabricante, int puestos) {
		super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
		
		this.puestos = puestos;
		Automovil.cantidad += 1;
	}
	
	public static int cantidad() {
		return Automovil.cantidad;
	}
	
	public int getPuestos() {
		return this.puestos;
	}
	
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	

}
