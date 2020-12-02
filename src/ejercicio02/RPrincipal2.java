package ejercicio02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RPrincipal2 {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		String comando = "ls";
		
		
		
		try {
			
			Process p = rt.exec(comando);		
			
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			
			String linea;
			while ((linea = br.readLine())!=null) {
				System.out.println(linea);
			}
			
		} catch (IOException e) {
			e.getMessage();
		}
	}

}
