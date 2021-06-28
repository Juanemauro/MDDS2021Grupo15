package Vistas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import API.Sesion;
import Sistema.Usuario;

public abstract class Vista {
	
	private VistaInicio inic;
	private Vista vistaAnterior;
	private Usuario u;
	private Sesion mySesion;
	private String nombre;

	
	public Vista(VistaInicio inic, Vista vistaAnterior, Usuario u, Sesion mySesion, String nombre) {
		super();
		this.nombre=nombre;
		this.inic = inic;
		this.vistaAnterior = vistaAnterior;
		this.u = u;
		this.mySesion = mySesion;
	}
	
	public Vista(Usuario u, Sesion mySesion, String nombre) {
		super();
		this.nombre= nombre;
		this.inic = null;
		this.vistaAnterior = null;
		this.u = u;
		this.mySesion = mySesion;
	}
	
	
	public abstract void mostrar();

	
	public VistaInicio getInic() {
		return inic;
	}

	public Vista getVistaAnterior() {
		return vistaAnterior;
	}

	public Usuario getU() {
		return u;
	}

	public Sesion getMySesion() {
		return mySesion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getOpElegida() {
		var br = new BufferedReader(new InputStreamReader(System.in));
		String aux=null;
		try {
			aux = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return aux;
	}

	public void setU(Usuario u) {
		this.u = u;
	}
	
}
