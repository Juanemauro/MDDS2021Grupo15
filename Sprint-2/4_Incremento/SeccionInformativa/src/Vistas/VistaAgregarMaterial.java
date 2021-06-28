package Vistas;



import API.Sesion;
import Sistema.Usuario;

public class VistaAgregarMaterial extends Vista{
	
	
	
	public VistaAgregarMaterial(VistaInicio inic, Vista vistaAnterior, Usuario u, Sesion mySesion, String nombre) {
		super(inic, vistaAnterior, u, mySesion, nombre);
	
	}

	public void mostrar() {
		
		if(this.getU().getToken()) {
			
			System.out.println("Ingrese nombre del Material: ");
			String nomMat= this.getOpElegida();
			
			System.out.println("Ingrese categoria del Material: ");
			String catMat= this.getOpElegida();
			
			if(this.getMySesion().setMaterial(this.getU(),nomMat,catMat)){
				
				System.out.println("El material fue agregado con exito!!");
				System.out.println("1) agregar otro material");
				System.out.println("2) "+ this.getInic().getNombre());
				
				
				String op =this.getOpElegida();
				
				if(op.equals("1")) {
					
					this.mostrar();
					
				}else if(op.equals("2")) {
					
					
					this.getInic().mostrar();
				
				}else 
						System.out.println("opcion incorrecta");
			}else {
				
				System.out.println("El material no pudo ser agregado!!");
				System.out.println("1) reintenar");
				System.out.println("2) " + this.getInic().getNombre());
		
				String op =this.getOpElegida();
				
				if(op.equals("1")) {
					
					this.mostrar();
					
				}else if(op.equals("2")) {
					
					this.getInic().mostrar();
				
				}else 
					System.out.println("opcion incorrecta");
			}
			
		
		}else {
			System.out.println("nos esta autenticado");
			this.getInic().mostrar();
		}
	}
}

