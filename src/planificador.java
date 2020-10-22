import java.util.ArrayList;
import java.util.Collections;

public class planificador {

	public static void main(String[] args) {
		
		
	}
	
	public static void preparaMicroprocesador() {
		
		ArrayList<ProcesoImpresion> procesos = new ArrayList<ProcesoImpresion>();
		
		for (int i = 0; i < 5; i++) {
			ProcesoImpresion pi = new ProcesoImpresion("P_" + i, ((int) Math.floor(Math.random()*4+1)) * 1000);
			procesos.add(pi);
			
		}
		
		Collections.shuffle(procesos);
		
		for (ProcesoImpresion p : procesos) {
			PlanificadorFCFS.Put(p);
		}
	}
	
	public static void preparaMicroprocesadorSTFS() {
		for (int i = 0; i <= 5; i++) {
			ProcesoImpresion pi = new ProcesoImpresion("P_" + i, ((int)Math.floor(Math.random()*4+1)));
			PlanificadorSTF.Put(pi);
		}
	}
	
	
	

}
