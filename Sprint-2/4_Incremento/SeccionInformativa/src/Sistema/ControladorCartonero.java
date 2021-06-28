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
   
    public Vector<Cartonero> getMaterialesAcopiados(){
    	Vector<Cartonero>  salida = new Vector<Cartonero>();
        for(int i=0; i<cartoneros.size();i++){
            Cartonero aux = cartoneros.get(i);
            salida.add(aux.copy());
        }
        return salida;
    }
    
}


/*
(
nombre:String, 
nombreMaterial: String,
pesoMaterial:String,
)
(
nombre:String, 
nombreMaterial: String,
pesoMaterial:float,
porcentajeDelTotal:float
)
Leon9715:09
porcentaje = pesoMaterial / pesoTotalMaterial
*/