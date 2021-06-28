package Sistema;


public class Usuario {
	private boolean token;
	
	public Usuario(boolean aux) {
		token=aux;
	}
	
	public void logout(){
		token=false;
	}
	
	public boolean getToken() {
		return token;
	}
}
