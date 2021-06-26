package Vistas;

import java.util.Scanner;
import java.util.Vector;

import API.Sesion;
import Sistema.Cartonero;
import Sistema.Material;
import Sistema.Usuario;

public class VistaMaterialesPorCartonero {
	public void mostrar(Usuario u) {
		if(u.getToken()) {
			System.out.println("Ingrese nombre del Cartonero: ");
			Scanner in = new Scanner(System.in);
			String nomCart= in.next();
			Sesion mySesion = new Sesion();
			Vector<Material> matPorCar= mySesion.getMaterialesAcopiados(u, new Cartonero(nomCart));
			System.out.println("El material fue agregado con exito!!");
			System.out.println("1) agregar otro material ");
			System.out.println("2) volver al inicio");
			int op =in.nextInt();
			if(op == 1) {
				this.mostrar(u);
			}else if(op == 2) {
				VistaInicio log= new VistaInicio();
				log.mostrar();
			}else 
				System.out.println("opcion incorrecta");
			}else {
				System.out.println("El material no pudo ser agregado!!");
				System.out.println("1) reintenar");
				System.out.println("2) volver al inicio");
				int op =in.nextInt();
				if(op == 1) {
					this.mostrar(u);
				}else if(op == 2) {
					VistaInicio log= new VistaInicio();
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
