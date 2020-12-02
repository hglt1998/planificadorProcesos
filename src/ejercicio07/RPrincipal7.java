package ejercicio07;

import java.io.IOException;

public class RPrincipal7 {

	public static void main(String[] args) {	
		String comandoLinux = "firefox";
		
		String comando = comandoLinux;
		
		try {
			ProcessBuilder pb = new ProcessBuilder(comando, "iescristobaldemonroy.es");
			pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
