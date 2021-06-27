package Vistas;

import java.util.Scanner;
import java.util.Vector;

import API.Sesion;
import Sistema.Material;
import Sistema.Usuario;

public class VistaMaterialesPorCartonero {
	public void mostrar(Usuario u, Sesion mySesion) {
		VistaInicio inic= new VistaInicio(u, mySesion);
		if(u.getToken()) {
			System.out.println("Ingrese nombre del Cartonero: ");
			Scanner in = new Scanner(System.in);
			
			String nomCart= in.next();
			Vector<Material> matPorCar= mySesion.getMaterialesAcopiados(u, nomCart);
			
			if(matPorCar.size()!=0) {
				for(int i=0; i<matPorCar.size(); i++) {
					System.out.println("Los materiales acopiados por: " + nomCart);
					System.out.println("- "+ matPorCar.get(i));
				}				
			}else 
				System.out.println("El cartonero con el nombre ingresado no tine materiales acopiados!!");
			
			System.out.println("1) Preguntar por otro cartonero");
			System.out.println("2) volver a inicio");
			
			String op=in.next();
			if(op.equals("1")){
				this.mostrar(u, mySesion);
			}else if(op.equals("2")) {
				inic.mostrar();
			}else 
				System.out.println("opcion incorrecta");
		
			in.close();
		
		}else{
			System.out.println("nos esta autenticado");
			inic.mostrar();
		}
	}
}
