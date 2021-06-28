package Vistas;

import API.Sesion;
import Sistema.Usuario;

public class VistaInicio extends Vista{
	
	public VistaInicio(){
		super(new Usuario(false),new Sesion(), "Inicio");
	}
	
	public VistaInicio(Sesion s){
		super(new Usuario(false),s, "Inicio");
	}
	
	public void mostrar() {
		Vista login = new VistaLogin(this,this,this.getU(),this.getMySesion(),"Login");
		Vista verMatAcep = new VistaVerMaterialesAceptados(this,this,this.getU(),this.getMySesion(),"Materiales Aceptados");
		Vista visSecretaria = this.getMySesion().getMenuSecretaria(this.getU(), this, this);
		
		System.out.println("Eliga una opcion: ");
		
		System.out.println("1) "+ login.getNombre());
		System.out.println("2) "+ verMatAcep.getNombre());
		
		if(this.getU().getToken())
			System.out.println("3) "+ visSecretaria.getNombre());
		
		
		String op =this.getOpElegida();
		
		if(op.equals("1")) {
			login.mostrar();
		}else if(op.equals("2")) {
			verMatAcep.mostrar();
		}else if(this.getU().getToken() && op.equals("3")) {
			visSecretaria.mostrar();
		}else 
			System.out.println("opcion incorrecta");
		
	}
}
