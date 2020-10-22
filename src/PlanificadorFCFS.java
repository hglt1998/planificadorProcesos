import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PlanificadorFCFS {
	
	private static Queue<Proceso> queue;
	
	static {
		queue = new LinkedList<Proceso>();
	}

	private static void Collection() {
		
		Queue<Proceso> cola;
		
		
		Collections.shuffle((List<?>) cola);
		
		
	}
	
	private static void Get(Queue<Proceso> cola) {
		cola.poll();
	}
	
	private static void Put(Proceso proceso, Queue<Proceso> cola) {
		
		cola.add(proceso);
	}
	
	private static void Sirve(Queue<Proceso> cola) {
		
		for (int i = 0; i < 5; i++) {
			Get(cola);
		}
		
	}
}
