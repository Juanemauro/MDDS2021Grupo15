package Filtros;
import Sistema.Material;

public class FiltroNombre extends Filtro {

	@Override
	public boolean cumple(Material m1) {
		// TODO Auto-generated method stub
		//retorna si el nombre del material es igual al nombreAcomparar
		return false;
	}	
	private String nombreAComparar;
	
	public FiltroNombre(String nombre){
	nombreAComparar= nombre;
}


}
