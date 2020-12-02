package ejercicio01;

import java.io.IOException;

public class Principal1 {

	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		String comandoLinux = "firefox iescristobaldemonroy.es";
		
		try {
			
			rt.exec(comandoLinux);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
