package Vistas;

import java.util.Scanner;

import API.Sesion;
import Sistema.Usuario;



public class VistaSecretaria {

	
	public void mostrar(Usuario u, Sesion s) {
		VistaInicio inic = new VistaInicio(u,s);
		if(u.getToken()) {
			
			System.out.println("Eliga una opcion: ");
			System.out.println("1) Logout ");
			System.out.println("2) agregar Materiales Aceptados");
			System.out.println("3) ver Materiales Acopiados por cartonero");
			System.out.println("4) volver a inicio");
			
			Scanner in = new Scanner(System.in);
			String op =in.next();
			
			if(op.equals("1")) {
				s.logOut(u);
				inic.mostrar();
			}else if(op.equals("2")) {
				VistaAgregarMaterial log= new VistaAgregarMaterial();
				log.mostrar(u,s);
			}else if(op.equals("3")) {
				VistaMaterialesPorCartonero log= new VistaMaterialesPorCartonero();
				log.mostrar(u,s);
			}else if(op.equals("4")) {
				inic.mostrar();
			}else 
				System.out.println("opcion incorrecta");
			
			in.close();
		
		}else {
			System.out.println("no estas autenticado");
		    inic.mostrar();
		    }
	}
}
