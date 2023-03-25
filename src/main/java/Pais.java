package vehiculos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Pais {
	private String nombre;
	
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
	
	public static Pais paisMasVendedor() {
		ArrayList<Pais> objpaises = new ArrayList<Pais>();
		ArrayList<String> paises = new ArrayList<String>();
		ArrayList<String> nombrespais = new ArrayList<>(Arrays.asList());
		
		for (Vehiculo v: Vehiculo.listadoVehiculos) {
			if (v.getFabricante() != null) {objpaises.add(v.getFabricante().getPais());}
		}
		
		for (Pais op: objpaises) {
			if (op != null) {paises.add(op.getNombre());}
		}
		
		for (String p: paises) {
			nombrespais.add(p);
		}
		
		Map<String, Integer> ventasPorPais = new HashMap<>();
		int masVentas = 0;
		String masVendedor = null;
		
		for (String pais:nombrespais) {
			int count = ventasPorPais.getOrDefault(pais, 0) + 1;
			ventasPorPais.put(pais, count);
            if (count > masVentas) {
                masVentas = count;
                masVendedor = pais;
			}
		}
		
		for (Pais op: objpaises) {
			if (op.getNombre() == masVendedor) {
				return op;
			}
		}
		return null;
	}
}
