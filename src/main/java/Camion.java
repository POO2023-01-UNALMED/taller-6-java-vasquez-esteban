package vehiculos;

public class Camion extends Vehiculo {
	private int ejes;
	private static int cantidadCamiones;
	
	public Camion(String placa, String nombre,
			int precio, int peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4x2", fabricante);
		this.setEjes(ejes);
		cantidadCamiones++;
	}
	
	public Camion() {
		this("", "", 0, 0, null, 0);
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	public static int getCantidadCamiones() {
		return cantidadCamiones;
	}
}
