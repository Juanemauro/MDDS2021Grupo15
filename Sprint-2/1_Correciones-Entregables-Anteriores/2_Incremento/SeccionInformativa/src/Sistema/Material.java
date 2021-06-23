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

}
