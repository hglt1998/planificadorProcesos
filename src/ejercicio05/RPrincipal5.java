package ejercicio05;

public class RPrincipal5 {

	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		String comandoLinux = "ls --help";
		String comando = comandoLinux;
		Process p = null;
		String error = null;
		try {
			p = rt.exec(comando);
		} catch (Exception e) {
			e.printStackTrace();
			error = e.getMessage();
		}
		
		int status;
		try {
			status = p.waitFor();
			System.out.println(status);
			System.out.println("El comando " + comando + " ha arrojado el siguient error: " + error);			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

		
	}

}
