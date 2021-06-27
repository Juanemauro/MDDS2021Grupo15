package Vistas;

import java.util.Scanner;

import API.Sesion;
import Sistema.Usuario;

public class VistaInicio {
	private Usuario u; 
	private Sesion mySesion;
	public VistaInicio(){
		u= new Usuario();
		mySesion= new Sesion();
	}
	
	public VistaInicio(Usuario u, Sesion s){
		this.u= u;
		mySesion= s;
	}
	
	public void mostrar() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Eliga una opcion: ");
		System.out.println("1) Login ");
		System.out.println("2) Ver Materiales Aceptados");
		if(u.getToken())
			System.out.println("3) Menu Secretaria");
		
		String op =in.next();
		
		if(op.equals("1")) {
			VistaLogin log= new VistaLogin();
			log.mostrar(u, mySesion);
		}else if(op.equals("2")) {
			VistaVerMaterialesAceptados log= new VistaVerMaterialesAceptados();
			log.mostrar(mySesion, u);
		}else if(op.equals("3") && u.getToken()) {
			VistaSecretaria log= new VistaSecretaria();
			log.mostrar(u,mySesion);
		}else 
			System.out.println("opcion incorrecta");
		
		
		in.close();
	}
}
