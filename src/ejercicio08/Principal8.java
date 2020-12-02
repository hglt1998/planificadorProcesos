package ejercicio08;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Principal8 {

	public static void main(String[] args) {
//		ProcessBuilder pENV = new ProcessBuilder();
//		Map <String, String> variables = pENV.environment();
//		System.out.println(variables);
		
		List <String> lCommand = new ArrayList<String>();
		lCommand.add("ls");
		lCommand.add("--help");
		
		ProcessBuilder pb = new ProcessBuilder(lCommand);
		System.out.println(pb.command());
		
		try {
			
			pb.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
