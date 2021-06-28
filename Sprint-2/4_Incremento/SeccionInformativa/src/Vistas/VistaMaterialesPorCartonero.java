package Vistas;


import java.util.Vector;

import API.Sesion;
import Sistema.Usuario;

public class VistaMaterialesPorCartonero extends Vista{
	
	
	
	public VistaMaterialesPorCartonero(VistaInicio inic, Vista vistaAnterior, Usuario u, Sesion mySesion,
			String nombre) {
		super(inic, vistaAnterior, u, mySesion, nombre);
		
	}

	public void mostrar() {
		
		
		if(this.getU().getToken()) {
			System.out.println("Lista Materiales Acopiados");
			
			Vector<String> matPorCar=this.getMySesion().getMaterialesAcopiados(this.getU());
			
			if(matPorCar.size()!=0) {
				for(int i=0; i<matPorCar.size(); i++) {
					System.out.println("- "+ matPorCar.get(i));
				}				
			}else 
				System.out.println("No hay materiales acopiados!!");
					
		}else{
			System.out.println("nos esta autenticado");
		}
		this.getInic().mostrar();
	}
}
