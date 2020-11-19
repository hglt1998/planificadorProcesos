package ejercicio8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Principal8 {

	public static void main(String[] args) {
		ProcessBuilder pENV = new ProcessBuilder();
		Map <String, String> variables = pENV.environment();
		System.out.println(variables);
		
		List <String> lCommand = new ArrayList<String>();
		lCommand.add("CMD");
		lCommand.add("/C");
		lCommand.add("DIRRR");
		
		ProcessBuilder pb = new ProcessBuilder(lCommand);
		System.out.println(pb.command());
		
		try {
			
			pb.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
