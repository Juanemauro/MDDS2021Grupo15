package Vistas;

import java.util.Vector;

import API.Sesion;
import Sistema.Material;

public class VistaVerMaterialesAceptados {
	public void mostrar() {
		Sesion mySesion= new Sesion();
		Vector<Material> mAcep= mySesion.getMaterial(null);
		for(int i=0; i<mAcep.size(); i++) {
			System.out.println(mAcep.get(i));
		}
		VistaInicio inic= new VistaInicio();
		inic.mostrar();
	}
}
