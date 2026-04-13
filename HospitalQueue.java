package Hospital1Project;
import java.util.PriorityQueue;
public class HospitalQueue {
	 private PriorityQueue<Patient> queue =
	            new PriorityQueue<>((a, b) -> b.priority - a.priority);

	    public synchronized void addPatient(Patient p) {
	        queue.add(p);
	        notify();
	    }

	    public synchronized Patient getPatient() {
	        while (queue.isEmpty()) {
	            try {
	                wait();
	            } catch (Exception e) {}
	        }
	        return queue.poll();
	    }

}
