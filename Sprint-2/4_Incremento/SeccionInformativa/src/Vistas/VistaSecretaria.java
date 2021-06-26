package Vistas;

import java.util.Scanner;

import Sistema.Usuario;



public class VistaSecretaria {

	public VistaSecretaria() {
		super();	
	}

	public void mostrar(Usuario u) {
		if(u.getToken()) {
			System.out.println("Eliga una opcion: ");
			System.out.println("1) Logout ");
			System.out.println("2) agregar Materiales Aceptados");
			System.out.println("3) ver Materiales Acopiados por cartonero");
			System.out.println("4) volver a inicio");
			Scanner in = new Scanner(System.in);
			int op =in.nextInt();
			if(op == 1) {
				VistaLogOut log= new VistaLogOut();
				log.mostrar(u);
			}else if(op == 2) {
				VistaAgregarMaterial log= new VistaAgregarMaterial();
				log.mostrar(u);
			}else if(op == 3) {
				VistaMaterialesPorCartonero log= new VistaMaterialesPorCartonero();
				log.mostrar(u);
			}else if(op == 4) {
				VistaInicio log= new VistaInicio();
				log.mostrar();
			}else 
				System.out.println("opcion incorrecta");
			in.close();
		}else
			System.out.println("no estas autenticado");
		    VistaInicio inic = new VistaInicio();
		    inic.mostrar();
	}
}
