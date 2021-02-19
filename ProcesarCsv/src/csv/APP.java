package csv;

public class APP {

	
	
	public static void main(String[] args) {
		
		Controlador c = new Controlador();
		c.cargarPersonas();
		
		System.out.println(c.getPersonas());
		
		
	}

}
