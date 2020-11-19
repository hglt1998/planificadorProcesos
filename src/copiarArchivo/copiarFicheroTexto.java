package copiarArchivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copiarFicheroTexto {

//	private static final String NOMBRE_ORIGINAL = "fichero.txt";
//	private static final String NOMBRE_DESTINO = "";
	
	public static void main(String[] args) {
		
		try (BufferedReader filtroLectura = new BufferedReader(new FileReader("Recursos/fichero.txt"));
				BufferedWriter filtroEscritura = new BufferedWriter(new FileWriter("Recursos/ficheroCopiado.txt"));){
			
			String lineaLeida;
			
			lineaLeida = filtroLectura.readLine();
			while (lineaLeida != null) {
				filtroEscritura.write(lineaLeida);
				filtroEscritura.newLine();
				lineaLeida = filtroLectura.readLine();
				
			}
			
			System.out.println("Fichero copiado con éxito.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
