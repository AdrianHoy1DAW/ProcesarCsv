package csv;

public class Persona implements Comparable<Persona>{

	private String nombre;
	private String apellido;
	private String DNI;
	private int edad;
	
	public Persona(String nombre, String apellido, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		DNI = dni;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return  nombre + "," + apellido + "," + DNI + "," + edad + "\n";
	}

	@Override
	public int compareTo(Persona p) {
	
		return DNI.compareTo(p.DNI);
	
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDNI() {
		return DNI;
	}

	public int getEdad() {
		return edad;
	}
	
	
	
	
	
	
	

	
}
