package vehiculos;

public class Camioneta extends Vehiculo {
	private boolean volco;
	private static int cantidadCamionetas;
	
	public Camioneta(String placa, int puertas, String nombre,
			int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa , puertas, 90, nombre, precio, peso, "4x4", fabricante);
		this.setVolco(volco);
		cantidadCamionetas++;
		
	}
	
	public Camioneta() {
		this("", 0, "", 0, 0, null, false);
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}

	public static int getCantidadCamionetas() {
		return cantidadCamionetas;
	}
}
