package Vistas;

import java.util.Scanner;

import Sistema.Usuario;

public class VistaInicio {
	private Usuario u; 
	
	public VistaInicio(){
		u= new Usuario();
	}
	
	public void mostrar() {
		System.out.println("Eliga una opcion: ");
		System.out.println("1) Login ");
		System.out.println("2) Ver Materiales Aceptados");
		Scanner in = new Scanner(System.in);
		int op =in.nextInt();
		if(op == 1) {
			VistaLogin log= new VistaLogin();
			log.mostrar(u);
		}else if(op == 2) {
			VistaVerMaterialesAceptados log= new VistaVerMaterialesAceptados();
			log.mostrar();
		}else 
			System.out.println("opcion incorrecta");
		in.close();
	}
}
