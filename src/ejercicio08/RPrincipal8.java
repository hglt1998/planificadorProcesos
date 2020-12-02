package ejercicio08;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RPrincipal8 {

	public static void main(String[] args) {
		
			
		ProcessBuilder pEnv = new ProcessBuilder();
		System.out.println(pEnv.environment());
		
		List<String> comando = new ArrayList<String>();
		comando.add("ls");
		comando.add("--help");
		
		ProcessBuilder pb = new ProcessBuilder(comando);
		System.out.println(pb.command());
		
		try {
			pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}

}
