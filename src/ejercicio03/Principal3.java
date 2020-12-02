package ejercicio03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal3 {

	private static final String FICHERO_DESTINO = "fichero_destino.txt";
	
	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		String comando = "ls";
		BufferedReader filtroLectura = null;
		BufferedWriter filtroEscritura = null;
		
		try {
			
			Process proceso = rt.exec(comando);
			filtroLectura = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
			filtroEscritura = new BufferedWriter(new FileWriter(FICHERO_DESTINO));
			
			String linea;
			while ((linea = filtroLectura.readLine()) != null) {
				filtroEscritura.write(linea);
				filtroEscritura.newLine();
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				filtroLectura.close();
				filtroEscritura.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
