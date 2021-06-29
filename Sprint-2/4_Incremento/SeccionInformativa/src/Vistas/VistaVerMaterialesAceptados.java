package Vistas;

import java.util.Vector;

import API.Sesion;
import Sistema.Usuario;

public class VistaVerMaterialesAceptados extends Vista{
	
	
	
	public VistaVerMaterialesAceptados(VistaInicio inic, Vista vistaAnterior, Usuario u, Sesion mySesion,
			String nombre) {
		super(inic, vistaAnterior, u, mySesion, nombre);
	}

	public void mostrar() {
		
		Vector<String> mAcep= this.getMySesion().getMaterial(null);
		
		System.out.println("los Materiles Aceptados son: ");
		for(int i=0; i<mAcep.size(); i++) {
			System.out.println("-" + mAcep.get(i));
		}
		
		
		this.getInic().mostrar();
	}
}
