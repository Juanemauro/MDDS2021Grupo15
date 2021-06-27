package Sistema;

import java.util.Vector;

public class ControladorCartonero {

    Vector<Cartonero> cartoneros;

    public ControladorCartonero(){
    	cartoneros= new Vector<Cartonero>();
    }

    public void addCartonero(Cartonero c){
        if (!cartoneros.contains(c)){
            cartoneros.add(c);
        }
    }
   
    public Vector<Material> getMaterialesAcopiados(Cartonero c){
        Vector<Material> salida = new Vector<Material>();

        for(int i=0; i<cartoneros.size(); i++){
            Cartonero aux = cartoneros.get(i);
            salida.addAll(aux.getMaterialesAcopiadosCartoneros());
        }

        return salida;
    }
    
}
