package Filtros;
import Sistema.Material;

public class FiltroCategoria extends Filtro {

	@Override
	public boolean cumple(Material m1) {
		// TODO Auto-generated method stub
		//retorna si el nombre del material es igual al CategoriaAcomparar

		return false;
	}
	
	private String CategoriaAComparar;
		
		public FiltroCategoria(String Categoria){
		CategoriaAComparar= Categoria;
	}

}
