package vehiculos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Fabricante {
	private String nombre;
	private Pais pais;
	
	public Fabricante(String nombre, Pais pais) {
		this.setNombre(nombre);
		this.setPais(pais);
	}
	
	public Fabricante() {
		this("", null);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		ArrayList<Fabricante> objfabricante = new ArrayList<Fabricante>();
		ArrayList<String> fabricante = new ArrayList<String>();
		ArrayList<String> nombresfabricante = new ArrayList<>(Arrays.asList());
		
		for (Vehiculo v: Vehiculo.listadoVehiculos) {
			if (v.getFabricante() != null) {objfabricante.add(v.getFabricante());}
		}
		
		for (Fabricante of: objfabricante) {
			if (of != null) {fabricante.add(of.getNombre());}
		}
		
		for (String p: fabricante) {
			nombresfabricante.add(p);
		}
		
		Map<String, Integer> ventasPorFabricante = new HashMap<>();
		int masVentas = 0;
		String masVendedor = null;
		
		for (String fab:nombresfabricante) {
			int count = ventasPorFabricante.getOrDefault(fab, 0) + 1;
			ventasPorFabricante.put(fab, count);
            if (count > masVentas) {
                masVentas = count;
                masVendedor = fab;
			}
		}
		
		for (Fabricante of: objfabricante) {
			if (of.getNombre() == masVendedor) {
				return of;
			}
		}
		return null;
	}
}
