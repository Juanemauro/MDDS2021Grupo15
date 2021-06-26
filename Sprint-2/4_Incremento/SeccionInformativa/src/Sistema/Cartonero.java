package Sistema;

import java.util.Vector;

public class Cartonero {

    private String nombre;
	private Vector<Material> materialesAcopiados;
	
	public Cartonero(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void addMateriales(Material m) {
		if (!materialesAcopiados.contains(m)) {
			materialesAcopiados.add(m);
		}	
	}
	
	public Vector<Material> getMaterialesAcopiadosCartoneros(){
		Vector<Material> salida = new Vector<Material>();
		for (int i=0; i<materialesAcopiados.size(); i++) {
			Material aux = materialesAcopiados.get(i);
			salida.add(aux);
		}
		return salida;
	}


}
