package API;

import java.util.Vector;

import Filtros.FiltroTrue;
import Sistema.*;

public class Sesion {
	
	ControladorMaterial nuestrosMateriales;
	ControladorCartonero nuestrosCartoneros;
	public Sesion() {
		nuestrosMateriales= new ControladorMaterial();
		nuestrosCartoneros= new ControladorCartonero();
	}
	
	public Vector<Material> getMaterial(Usuario u){
		Vector<Material> materiales= new Vector<Material>();
		materiales.addAll(nuestrosMateriales.getMaterial(new FiltroTrue()));
		return materiales;
	}
	
	public boolean setMaterial(Usuario u, Material m) {
		if(u.getToken()==true) {
			nuestrosMateriales.addMaterial(m);
			return true;
		}
		else
			return false;
	}
	
	public boolean login(Usuario u, String nombre, String contrasena) { 
		u.login(nombre, contrasena);
		return u.getToken();
	}

	public void logOut(Usuario u) {
		u.logout();
	}
	
	public Vector<Material> getMaterialesAcopiados(Usuario u, Cartonero c) {
		if(u.getToken()==true)
			return nuestrosCartoneros.getMaterialesAcopiados(c);
		else 
			return null;
	}
}
