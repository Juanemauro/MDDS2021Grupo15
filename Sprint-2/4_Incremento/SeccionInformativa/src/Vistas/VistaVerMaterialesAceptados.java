package Vistas;

import java.util.Vector;

import API.Sesion;
import Sistema.Material;
import Sistema.Usuario;

public class VistaVerMaterialesAceptados {
	public void mostrar(Sesion s, Usuario u) {
		
		Vector<Material> mAcep= s.getMaterial(null);
		
		System.out.println("los Materiels Aceptados son: ");
		for(int i=0; i<mAcep.size(); i++) {
			System.out.println("-" + mAcep.get(i));
		}
		
		VistaInicio inic= new VistaInicio(u,s);
		inic.mostrar();
	}
}
