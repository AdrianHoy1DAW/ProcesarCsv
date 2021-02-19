package csv;

public class Persona {

	private String nombre;
	private String apellido;
	private String DNI;
	private String edad;
	
	public Persona(String nombre, String apellido, String dni, String edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		DNI = dni;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", edad=" + edad + "]\n";
	}
	
	
	
	

	
}
