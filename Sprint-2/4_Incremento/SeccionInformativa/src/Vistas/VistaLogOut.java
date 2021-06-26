package Vistas;

import API.Sesion;
import Sistema.Usuario;

public class VistaLogOut {
	public void mostrar(Usuario u) {
		Sesion s= new Sesion();
		s.logOut(u);
		VistaInicio inic= new VistaInicio();
		inic.mostrar();
	}
}
