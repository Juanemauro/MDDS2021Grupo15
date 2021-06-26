package Sistema;

import java.util.Vector;

import Filtros.Filtro;

public class ControladorMaterial {

    private Vector<Material> materialesAceptados;

    public ControladorMaterial(){
    }

    public void addMaterial(Material m){
        if (!materialesAceptados.contains(m)){
            materialesAceptados.add(m);
        }
    }

    public Vector<Material> getMaterial(Filtro f1){
		Vector<Material> salida = new Vector<Material>();
		for (int i=0; i<materialesAceptados.size(); i++) {
			Material aux = materialesAceptados.get(i);
            if (f1.cumple(aux)){
                salida.add(aux);
            }
		}
		return salida;
	}

    

}
