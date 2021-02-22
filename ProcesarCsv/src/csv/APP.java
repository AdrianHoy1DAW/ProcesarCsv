package csv;

public class APP {

	
	
	public static void main(String[] args) {
		
		Controlador c = new Controlador();
		c.cargarPersonas();
		c.ordenarPorApellido();
		c.generarCsvEdad(10, 20);
		
		
		
		
	}

}
