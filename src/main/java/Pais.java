package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	private static ArrayList<Pais> listado = new ArrayList<Pais>();
	
	public Pais(String nombre) {
		this.setNombre(nombre);
	}
	
	public Pais() {
		this("");
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
