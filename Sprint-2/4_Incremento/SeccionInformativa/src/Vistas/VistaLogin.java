package Vistas;

import java.util.Scanner;

import API.Sesion;
import Sistema.Usuario;

public class VistaLogin {
	public void mostrar(Usuario id) {
		System.out.println("Ingrese Usuario: ");
		Scanner in= new Scanner(System.in);
		String us=  in.next();
		System.out.println("Ingrese Contraseña: ");
		String con=  in.next();
		Sesion s= new Sesion();
		if(s.login(id,us, con)){
			System.out.println("Se login exitoso!!");
			VistaSecretaria sVis= new VistaSecretaria();
			sVis.mostrar(id);
		}else {
			System.out.println("Usuario o contrasena incorreto!!");
			System.out.println("1) reintentar");
			System.out.println("2) inicio");
			int op =in.nextInt();
			if(op == 1) {
				this.mostrar(id);
			}else if(op == 2) {
				VistaInicio inic= new VistaInicio();
				inic.mostrar();
			}else 
				System.out.println("opcion incorrecta");
		}
		in.close();
	}
}
