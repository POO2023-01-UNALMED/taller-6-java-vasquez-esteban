package vehiculos;

import java.util.ArrayList;

public class Automovil extends Vehiculo {
	private int puestos;
	private static ArrayList<Automovil> listado = new ArrayList<Automovil>();
	
	public Automovil(String placa, String nombre,
			int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.setPuestos(puestos);
		
		listado.add(this);
	}
	
	public Automovil() {
		this("", "", 0, 0, null, 0);
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

