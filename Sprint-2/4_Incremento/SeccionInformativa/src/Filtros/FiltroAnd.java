package Filtros;
import Sistema.Material;

public class FiltroAnd extends Filtro {

	private Filtro f1;
	private Filtro f2;

	public FiltroAnd(Filtro f1, Filtro f2){
		this.f1= f1;
		this.f2= f2;
	}

	@Override
	public boolean cumple(Material m1) {
		return (f1.cumple(m1) && f2.cumple(m1));
	}


}
