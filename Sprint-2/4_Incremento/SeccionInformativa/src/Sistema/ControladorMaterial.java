package Sistema;

import java.util.Vector;

import Filtros.Filtro;

public class ControladorMaterial {

    private Vector<Material> materialesAceptados;

    public ControladorMaterial(){
    	materialesAceptados=new Vector<Material>();
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

    public Vector<Material> getMaterial(){
  		Vector<Material> salida = new Vector<Material>();
  		for (int i=0; i<materialesAceptados.size(); i++) {
            salida.add(materialesAceptados.get(i));
  		}
  		return salida;
  	}
    

}
