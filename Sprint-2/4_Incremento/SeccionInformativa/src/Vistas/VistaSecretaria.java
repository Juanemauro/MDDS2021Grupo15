package Vistas;


import API.Sesion;
import Sistema.Usuario;



public class VistaSecretaria extends Vista{


	public VistaSecretaria(VistaInicio inic, Vista vistaAnterior, Usuario u, Sesion mySesion, String nombre) {
		super(inic, vistaAnterior, u, mySesion, nombre);
	}

	public void mostrar() {

		if(this.getU().getToken()) {
			Vista visAgrMat= new VistaAgregarMaterial(this.getInic(), this, this.getU(),
					this.getMySesion(),"Agregar Nuevo Material Aceptado");
			Vista visMatPC= new VistaMaterialesPorCartonero(this.getInic(), this, this.getU(),
					this.getMySesion(),"Ver Materiales Por Cartonero");
			
			System.out.println("Eliga una opcion: ");
			System.out.println("1) LogOut ");
			System.out.println("2) "+ visAgrMat.getNombre());
			System.out.println("3) "+ visMatPC.getNombre());
			System.out.println("4) "+ this.getInic().getNombre());
			
			
			String op =this.getOpElegida();
			
			if(op.equals("1")) {
				
				this.getMySesion().logOut(this.getU());
				this.getInic().mostrar();
			
			}else if(op.equals("2")) {
				
				visAgrMat.mostrar();
			
			}else if(op.equals("3")) {
				
				visMatPC.mostrar();
			
			}else if(op.equals("4")) {
				this.getInic().mostrar();
			}else 
				System.out.println("opcion incorrecta");
			
		
		
		}else {
			System.out.println("no estas autenticado");
		    this.getInic().mostrar();
		    }
	}
}
