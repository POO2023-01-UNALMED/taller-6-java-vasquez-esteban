package vehiculos;

import java.util.ArrayList;

public class Camioneta extends Vehiculo {
	private boolean volco;
	private static ArrayList<Camioneta> listado = new ArrayList<Camioneta>();

	public Camioneta(String placa, int puertas, int velocidadMaxima, String nombre,
			int precio, int peso, String traccion, Fabricante fabricante, boolean volco) {
		super("", 0, 90, "", 0, 0, "4x4", null);
		this.setVolco(volco);
		listado.add(this);
	}
	
	public Camioneta() {
		this("", 0, 90, "", 0, 0, "4x4", null, false);
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	
	public static int cantidadCamionetas() {
		return listado.size();
	}

}

