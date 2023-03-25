package vehiculos;

import java.util.ArrayList;

public class Camion extends Vehiculo {
	private int ejes;
	private static ArrayList<Camion> listado = new ArrayList<Camion>();

	public Camion(String placa, String nombre,
			int precio, int peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4x2", fabricante);
		this.setEjes(ejes);
	}
	
	public Camion() {
		this("", "", 0, 0, null, 0);
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
