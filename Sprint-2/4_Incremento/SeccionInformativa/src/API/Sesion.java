package API;


import java.util.Map;
import java.util.Vector;


import Sistema.*;
import Vistas.Vista;
import Vistas.VistaInicio;
import Vistas.VistaSecretaria;

public class Sesion {
	
	ControladorMaterial nuestrosMateriales;
	ControladorCartonero nuestrosCartoneros;
	AuthUsuario auhtUs;
	
	public Sesion() {
		nuestrosMateriales= new ControladorMaterial();
		nuestrosCartoneros= new ControladorCartonero();
		auhtUs= new AuthUsuario();
	}
	
	public Vector<String> getMaterial(Usuario u){
		Vector<Material> materiales= new Vector<Material>();
		materiales.addAll(nuestrosMateriales.getMaterial());
		Vector<String> aux = new Vector<String>();
		for(int i=0; i<materiales.size();i++) {
			aux.add(materiales.get(i).toString());
		}
		return aux;
	}
	
	public boolean setMaterial(Usuario u,String nomMat, String catMat) {
		if(u.getToken()==true) {
			nuestrosMateriales.addMaterial(new Material(nomMat,catMat));
			return true;
		}
		else
			return false;
	}
	
	public Usuario login(String nombre, String contrasena) { 
		Usuario aux= auhtUs.login(nombre, contrasena);
		return aux;
	}

	public void logOut(Usuario u) {
		u.logout();
	}
	
	public Vector<String> getMaterialesAcopiados(Usuario u) {
		if(u.getToken()==true) {
			Vector<Cartonero> aux = nuestrosCartoneros.getMaterialesAcopiados();
			Vector<String> salida= new Vector<String>();
			for(int i=0; i<aux.size();i++) {
				Cartonero auxCartonero= aux.get(i);
				for(Map.Entry m:auxCartonero.getMaterialesAcopiadosCartoneros().entrySet()) {
					Material matAux=(Material)m.getKey();
					Double douAux= (Double)m.getValue();
					String tupla= "( "+ auxCartonero.toString() + ", " + matAux.getNombre()+ ", kilos: " + 
											douAux.toString() + ", porcentajeDelTotal: "+ matAux.getKilosAcopiados()/douAux +")";  
				}		
			}
			return salida;
		}else 
			return null;
	}
	
	
	public VistaSecretaria getMenuSecretaria(Usuario u, VistaInicio visInicio, Vista visAnt) {
		if(u.getToken()) {
			VistaSecretaria aux=new VistaSecretaria(visInicio,visAnt,u,this,"Menu Secretaria");
			return aux;
		}else
			return null;
	}
	
	
	
}
