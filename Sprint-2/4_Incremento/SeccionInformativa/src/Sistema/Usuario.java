package Sistema;

public class Usuario {
	private boolean token;
	
	public Usuario() {
		token=false;
	}
	
	public boolean login(String usuario, String con) {
		AuthUsuario auth= new AuthUsuario();
		if(auth.Login(usuario,con)) {
			token= true;
			return true;
		}else
			return false;
	}
	
	public void logout() {
		token=false;
	}
	
	public boolean getToken() {
		return token;
	}
}
