package Filtros;
import Sistema.Material;

public class FiltroOr extends Filtro {

	@Override
	public boolean cumple(Material m1) {
		// TODO Auto-generated method stub
		//retorna si uno de los filtros es verdadero
		return false;
	}
		
	private Filtro f1;
	private Filtro f2;

		
	public FiltroOr(Filtro f1, Filtro f2){
	this.f1= f1;
	this.f2= f2;
	}

}
