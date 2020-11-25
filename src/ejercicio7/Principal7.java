package ejercicio7;

import java.io.IOException;

public class Principal7 {

	public static void main(String[] args) {
		
		String comando = "firefox";
		ProcessBuilder pb = new ProcessBuilder(comando);
		
		try {
			pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
