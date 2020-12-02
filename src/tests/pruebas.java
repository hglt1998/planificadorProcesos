package tests;

public class pruebas {

	public static void main(String[] args) {
		
		ProcessBuilder process = new ProcessBuilder();
		String comando = "htop";
		
		process.command(comando);
		
		try {			
			
			process.start();
			
		} catch (Exception e) {
			e.getMessage();
		}		
	}

}
