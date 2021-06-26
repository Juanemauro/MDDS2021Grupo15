package Sistema;

public class Material {

	private String nombre;
	private String categoria;

	public Material(String nombre, String categoria){
		this.nombre=nombre;
		this.categoria= categoria;
	}

	public String getNombre(){
		return nombre;
	}
	
	public String getCategoria(){
		return categoria;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Nombre de Material: "+ getNombre()+ " Categoria: "+ getCategoria();
	}


}
