package Sistema;

public class Material {

	private String nombre;
	private String categoria;
	private double kilosAcopiados;
	private static int id=-1; 
	private int myId;
	
	public Material(String nombre, String categoria){
		this.myId=id++;
		this.nombre=nombre;
		this.categoria= categoria;
		kilosAcopiados= 0;
	}

	public int getId() {
		return myId;
	}
	
	public void aumentarKilos(double mas) {
		kilosAcopiados= kilosAcopiados +mas;
	}
	
	public void disminuirKilos(double menos) {
		kilosAcopiados= kilosAcopiados - menos;
	}
	
	public double getKilosAcopiados() {
		return kilosAcopiados;
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

	
	public boolean equals(Material m) {
		return m.getId()== this.myId;
	}
	
}
