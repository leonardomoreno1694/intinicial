package ar.edu.utn.java.modelo;

public class enviadorCorreos{
	
	public void enviadorCorreo(correoElectronico correo) 
	{
		String mensaje = String.format("correo: %s , asunto : %s", correo.getDirCorreo(),correo.getAsunto());
		
		System.out.println(mensaje);
	}
	

}
