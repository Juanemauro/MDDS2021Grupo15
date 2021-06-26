package Filtros;
import Sistema.Material;

public class FiltroNombre extends Filtro {

	private String nombre;
	
	public FiltroNombre(String nombre){
		this.nombre=nombre;
	}

	@Override
	public boolean cumple(Material m1) {
		return (m1.getNombre().equals(nombre));
	}


}
