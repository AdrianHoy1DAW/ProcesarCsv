package csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Controlador {

	public static String read = "personas.csv";
	private ArrayList<Persona> personas;
	
	public Controlador() {
		
		personas = new ArrayList<>();
		
	}
	
	public void cargarPersonas() {
		
		try(BufferedReader bf = new BufferedReader(new FileReader(read))) {
			
			String line ;
			
			while((line = bf.readLine()) != null) {
				personas.add(new Persona(line.split(",")[0],line.split(",")[1],line.split(",")[2],line.split(",")[3]));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public ArrayList<Persona> getPersonas() {
		return personas;
	}
	
	
	
}
