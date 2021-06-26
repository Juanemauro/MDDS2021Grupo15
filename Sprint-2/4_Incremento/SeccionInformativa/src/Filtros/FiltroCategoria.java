package Filtros;
import Sistema.Material;

public class FiltroCategoria extends Filtro {

	private String categoria;
		
	public FiltroCategoria(String categoria){
		this.categoria= categoria;
	}

	@Override
	public boolean cumple(Material m1) {
		return (m1.getCategoria().equals(categoria));
	}
	
}
