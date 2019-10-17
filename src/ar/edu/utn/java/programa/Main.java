package ar.edu.utn.java.programa;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import ar.edu.utn.java.modelo.correoElectronico;
import ar.edu.utn.java.modelo.enviadorCorreos;

public class Main {

	public static void main(String[] args) {
		
		/*correoElectronico correo = new correoElectronico();
		
		correo.setAsunto("asunto del mail");
		correo.setDirCorreo("leo_1694@hotmail.com");
		
		enviadorCorreos enviador =new enviadorCorreos();
		
		enviador.enviadorCorreo(correo);*/
		ArrayList<correoElectronico> correos = new ArrayList<>();
		Path path = Paths.get("main/resourse/email.txt");
	    try(BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"))){
	 
	       
	      String currentLine = null;
	      while((currentLine = reader.readLine()) != null){
	    	  correoElectronico correo = new correoElectronico();//while there is content on the current line
	    	  String[] lista = currentLine.split(",");
	    	  correo.setDirCorreo(lista[0]);
	    	  correo.setAsunto(lista[0]);
	          System.out.println(currentLine); // print the current line
	      }
	    }catch(IOException ex){
	      ex.printStackTrace(); //handle an exception here
	    }
		
	    enviadorCorreos enviador = new enviadorCorreos();
	    for(correoElectronico correo : correos) 
	    {
	    	enviador.enviadorCorreo(correo);
	    }
		
		

	}

}
