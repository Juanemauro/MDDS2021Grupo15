package Vistas;

import java.util.Scanner;

import API.Sesion;
import Sistema.Material;
import Sistema.Usuario;

public class VistaAgregarMaterial{
	public void mostrar(Usuario u, Sesion mySesion) {
		Scanner in = new Scanner(System.in);
		if(u.getToken()) {
			
			System.out.println("Ingrese nombre del Material: ");
			String nomMat= in.next();
			
			System.out.println("Ingrese categoria del Material: ");
			String catMat= in.next();
			
			if(mySesion.setMaterial(u, new Material(nomMat,catMat))){
				
				System.out.println("El material fue agregado con exito!!");
				System.out.println("1) agregar otro material ");
				System.out.println("2) volver al inicio");
				
				
				String op =in.next();
				if(op.equals("1")) {
					this.mostrar(u,mySesion);
					
				}else if(op.equals("2")) {
					VistaInicio log= new VistaInicio(u,mySesion);
					log.mostrar();
				
				}else 
						System.out.println("opcion incorrecta");
			}else {
				
				System.out.println("El material no pudo ser agregado!!");
				System.out.println("1) reintenar");
				System.out.println("2) volver al inicio");
		
				String op =in.next();
				
				if(op.equals("1")) {
					this.mostrar(u,mySesion);
				}else if(op.equals("2")) {
					
					VistaInicio log= new VistaInicio(u, mySesion);
					log.mostrar();
				
				}else 
					System.out.println("opcion incorrecta");
			}
			
			in.close();
		
		}else {
			System.out.println("nos esta autenticado");
			VistaInicio inic= new VistaInicio();
			inic.mostrar();
		}
	}
}

