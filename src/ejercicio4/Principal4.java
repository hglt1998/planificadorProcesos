package ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Principal4 {

	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		String comandoLinux = "ls -help";
		
		Process p = null;
		
		try {
		
			p = rt.exec(comandoLinux);
			
			InputStream filtroEntrada = p.getInputStream();
			BufferedReader flujoEntrada = new BufferedReader(new InputStreamReader(filtroEntrada));
			
			String linea;
			
			while ((linea = flujoEntrada.readLine()) != null) {
				System.out.println(linea);	
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
