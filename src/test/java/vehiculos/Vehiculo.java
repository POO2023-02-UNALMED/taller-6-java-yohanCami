package vehiculos;
import java.util.ArrayList;

public class Vehiculo {
	
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int CantidadVehiculos;
	
	private static ArrayList<Pais> paises = new ArrayList<>();
	private static ArrayList<Fabricante> fabricantes = new ArrayList<>();
	
	public Vehiculo() {
		this("111AAA", 4, 100, "Camaro", 1000000, 1000, "AVS", new Fabricante());
	}
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio,int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		
		Vehiculo.CantidadVehiculos += 1;
		Vehiculo.fabricantes.add(fabricante);
	}
	
	public String vehiculosPorTipo() {
		return "Automoviles: " + Automovil.cantidad() + "\n" + 
			   "Camionetas: " + Camioneta.cantidad() + "\n" + 
			   "Camiones: " + Camion.cantidad();
	}
	
	public static Pais masVentasPais() {
		
		ArrayList<Pais> paises = new ArrayList<>();
		
		ArrayList<Integer> repeticiones = new ArrayList<>();
		
		for (Fabricante fabricante : Vehiculo.fabricantes) {
			
			if(!paises.contains(fabricante.getPais())) {
				paises.add(fabricante.getPais());
				repeticiones.add(1);
			}else {
				int ubicacion = paises.indexOf(fabricante.getPais());
				repeticiones.set(ubicacion, repeticiones.get(ubicacion) + 1);
			}
            
        }
		
		int indexPais = maximoArray(repeticiones);
		
		return paises.get(indexPais);
		
	}
	
	public static Fabricante mayorFabricante() {
		
		ArrayList<Fabricante> fabri = new ArrayList<>();
		
		ArrayList<Integer> repeticiones = new ArrayList<>();
		
		for (Fabricante fabricante : Vehiculo.fabricantes) {
			
			if(!fabri.contains(fabricante)) {
				fabri.add(fabricante);
				repeticiones.add(1);
			}else {
				int ubicacion = fabri.indexOf(fabricante);
				repeticiones.set(ubicacion, repeticiones.get(ubicacion) + 1);
			}
            
        }
		
		int indexPais = maximoArray(repeticiones);
		
		return fabri.get(indexPais);
		
	}
	
	public static int maximoArray(ArrayList<Integer> numeros) {
		
		Integer maximo = numeros.get(0);
		int ubicacion = 0;

        for (Integer numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
                ubicacion = numeros.indexOf(maximo);
            }
        }
        
        return ubicacion;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	public int getPuertas() {
		return this.puertas;
	}
	
	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public int getPeso() {
		return this.peso;
	}
	
	public String getTraccion() {
		return this.traccion;
	}
	
	public Fabricante getFabricante() {
		return this.fabricante;
	}
	
	public static int getCantidadVehiculos() {
		return Vehiculo.CantidadVehiculos;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.CantidadVehiculos = cantidadVehiculos;
	}
}



