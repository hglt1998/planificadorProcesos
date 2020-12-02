package ejercicio01;

import java.io.IOException;

public class RPrincipal1 {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		String orden = "firefox";
		
		try {
			rt.exec(orden);
		} catch (IOException e) {
			e.getMessage();
		}
		
	}

}
