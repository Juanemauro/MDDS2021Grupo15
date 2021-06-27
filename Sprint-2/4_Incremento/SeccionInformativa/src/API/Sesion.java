package API;

import java.util.Vector;


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
		materiales.addAll(nuestrosMateriales.getMaterial());
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
	
	public Vector<Material> getMaterialesAcopiados(Usuario u, String s) {
		if(u.getToken()==true) {
			Cartonero c= new Cartonero(s);
			return nuestrosCartoneros.getMaterialesAcopiados(c);
		}else 
			return null;
	}
}
