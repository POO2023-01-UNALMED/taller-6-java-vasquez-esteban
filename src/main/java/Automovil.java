package vehiculos;

import java.util.ArrayList;

public class Automovil extends Vehiculo {
	private int puestos;
	private static ArrayList<Automovil> listado = new ArrayList<Automovil>();
	
	public Automovil(String placa, int puertas, int velocidadMaxima, String nombre,
			int precio, int peso, String traccion, Fabricante fabricante, int puestos) {
		super("", 4, 100, "", 0, 0, "FWD", null);
		this.setPuestos(puestos);
		
		listado.add(this);
	}
	
	public Automovil() {
		this("", 4, 100, "", 0, 0, "FWD", null, 0);
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	public static int cantidadAutomoviles() {
		return listado.size();
	}
}

