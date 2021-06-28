package Sistema;

import java.util.*;

public class Cartonero {

    private String nombre;
	private Hashtable<Material,Double> materialesAcopiados;

	
	public Cartonero(String nombre) {
		this.nombre = nombre;
		materialesAcopiados= new Hashtable<Material,Double>();
	}

	public String getNombre() {
		return nombre;
	}

	public void addMateriales(Material m, Double kilo) {
		if (!materialesAcopiados.contains(m)) {
			materialesAcopiados.put(m,kilo);
		}	
	}
	
	public Hashtable<Material,Double> getMaterialesAcopiadosCartoneros(){
		Hashtable<Material,Double> salida = new Hashtable<Material,Double>();
		for(Map.Entry m:materialesAcopiados.entrySet()){
			  salida.put((Material)m.getKey(), (Double)m.getValue());
		}
		return salida;
	}

	public Cartonero copy(){
		Cartonero aux= new Cartonero(this.getNombre());
		for(Map.Entry m:materialesAcopiados.entrySet()){
			  aux.addMateriales((Material)m.getKey(), (Double)m.getValue());
		}
		return aux;
	}
	
	@Override
	public String toString() {
		return getNombre();
	}
	
}
