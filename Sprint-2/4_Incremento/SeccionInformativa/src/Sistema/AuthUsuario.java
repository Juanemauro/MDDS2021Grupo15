package Sistema;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;


public class AuthUsuario {
    private Boolean token;
    private String dirArchivo;

    public  AuthUsuario(){
        this.token=false;
        this.dirArchivo = "c:\\usuarios.log";   
    }


    public Boolean Login (String usuario ,String contrasenia){
        ArrayList<String> lista = new ArrayList<String>();
        Scanner log = null;
        try {
            log = new Scanner (new File (dirArchivo));
        } 
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

        while (log.hasNextLine()){
            lista.add(log.nextLine());
        }
        //abro el archivo y lo cargo en la lista
        for (int line=0; line <lista.size();line++){
            String[] parts =lista.get(line).split(" ");
            String usr = parts[0];
            String pass = parts[1];
            if (usr==usuario && pass==contrasenia){
                this.token=true;
                return true;
            }
        }
        //compruebo que el usuario este en la coleccion, en tal caso pongo token en true, sino se vuelve false.
        this.token=false;
        return false;
    }

    public Void logOut(){
        this.token=false;
		return null;
    }
    public Boolean getToken(){
        return token;
    }
}
