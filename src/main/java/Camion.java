package vehiculos;

import java.util.ArrayList;

public class Camion extends Vehiculo {
	private int ejes;
	private static ArrayList<Camion> listado = new ArrayList<Camion>();

	public Camion(String placa, int puertas, int velocidadMaxima, String nombre,
			int precio, int peso, String traccion, Fabricante fabricante, int ejes) {
		super("", 2, 80, "", 0, 0, "4x2", null);
		this.setEjes(ejes);
	}
	
	public Camion() {
		this("", 2, 80, "", 0, 0, "4x2", null, 0);
	}
	
	public static int cantidadCamionetas() {
		return listado.size();
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	public static int cantidadCamiones() {
		return listado.size();
	}
}
