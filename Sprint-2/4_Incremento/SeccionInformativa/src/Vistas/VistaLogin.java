package Vistas;

import API.Sesion;
import Sistema.Usuario;

public class VistaLogin extends Vista{
	
	
	
	public VistaLogin(VistaInicio inic, Vista vistaAnterior, Usuario u, Sesion mySesion, String nombre) {
		super(inic, vistaAnterior, u, mySesion, nombre);
	}

	public void mostrar() {
		System.out.println("Ingrese Usuario: ");
		String us=  this.getOpElegida();
		System.out.println("Ingrese Contraseña: ");
		String con=  this.getOpElegida();
		this.setU(this.getMySesion().login(us, con));
		if(this.getU().getToken()){
			System.out.println("Se login exitoso!!");
			
			Vista visSecretaria = this.getMySesion().getMenuSecretaria(this.getU(), this.getInic(), this);
			visSecretaria.mostrar();
		
		}else {
			
			System.out.println("Usuario o contrasena incorrecto!!");
			System.out.println("1) reintentar");
			System.out.println("2) inicio");
			
			String op =this.getOpElegida();
			
			if(op.equals("1")) {
				this.mostrar();
			}else if(op.equals("2")) {
				this.getU().logout();
				this.getInic().mostrar();
			}else 
				System.out.println("opcion incorrecta");
		}
	}
}
