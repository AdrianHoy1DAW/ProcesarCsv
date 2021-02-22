package csv;

import java.util.List;
import java.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



public class Controlador {

	public static String read = "personas.csv";
	public static String escribir = "prueba.csv";
	private ArrayList<Persona> personas;
	
	public Controlador() {
		
		personas = new ArrayList<>();
		
	}
	
	public void cargarPersonas() {
		
		try(BufferedReader bf = new BufferedReader(new FileReader(read))) {
			
			String line ;
			
			while((line = bf.readLine()) != null) {
				personas.add(new Persona(line.split(",")[0],line.split(",")[1],line.split(",")[2],Integer.parseInt(line.split(",")[3])));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String ordenarPorNombre() {
		
		Collections.sort(personas,(p1,p2) -> p1.getNombre().compareTo(p2.getNombre()));
		
		return personas.toString();
		
	}
	
	public String ordenarPorApellido() {
		
		Collections.sort(personas,(p1,p2)-> p1.getApellido().compareTo(p2.getApellido()));
		
		return personas.toString();
		
	}
	
	public void generarCsv() {
		
		try(PrintWriter pw = new PrintWriter(new FileWriter(escribir))) {
			
			Iterator<Persona> it = personas.iterator();
			String line;
			
			while(it.hasNext()) {
				
				line = it.next().toString();
				pw.print(line);
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void generarCsvEdad(int edadMenor, int edadMayor) {
		
		List<Persona> edad = personas.stream()
				.filter(persona -> persona.getEdad() >= edadMenor && persona.getEdad() <= edadMayor)
				.collect(Collectors.toList());
		
		try(PrintWriter pw = new PrintWriter(new FileWriter(escribir))) {
			
			Iterator<Persona> it = edad.iterator();
			String line;
			
			while(it.hasNext()) {
				
				line = it.next().toString();
				pw.print(line);
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public ArrayList<Persona> getPersonas() {
		return personas;
	}
	
	
	
	
}
