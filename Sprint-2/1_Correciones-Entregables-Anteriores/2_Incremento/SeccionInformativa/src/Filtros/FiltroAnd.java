package Filtros;
import Sistema.Material;

public class FiltroAnd extends Filtro {

	@Override
	public boolean cumple(Material m1) {
		// TODO Auto-generated method stub
		//retorna si ambos filtros son verdaderos
		return false;
	}
	private Filtro f1;
	private Filtro f2;

	
	public FiltroAnd(Filtro f1, Filtro f2){
		this.f1= f1;
		this.f2= f2;
		
	}



}
