import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PlanificadorFCFS {
	
	private static Queue<ProcesoImpresion> queue;
	
	static {
		queue = new LinkedList<ProcesoImpresion>();
	}

	private static void Collection() {
		
		Queue<ProcesoImpresion> cola = new Queue<ProcesoImpresion>(;
		
		
		Collections.shuffle((List<?>) cola);
		
		
	}
	
	private static void Get(Queue<ProcesoImpresion> cola) {
		cola.poll();
	}
	
	private static void Put(ProcesoImpresion proceso) {
		
		queue.add(proceso);
	}
	
	private static void Sirve(Queue<ProcesoImpresion> cola) {
		
		for (int i = 0; i < 5; i++) {
			Get(cola);
		}
		
	}
}
