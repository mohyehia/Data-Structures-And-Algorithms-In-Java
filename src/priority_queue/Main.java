package priority_queue;
public class Main {
	public static void main(String[] args) {
		MyPriorityQueue<Patient> priorityQueue = new MyPriorityQueue<>();
		priorityQueue.enqueue(new Patient(1, "ahmed"));
		priorityQueue.enqueue(new Patient(2, "mohammed"));
		while(priorityQueue.size() > 0)
			System.out.println(priorityQueue.dequeue());
	}
}
class Patient implements Comparable<Patient>{
	int priority;
	String name;
	public Patient(int priority, String name) {
		this.priority = priority;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Patient [priority=" + priority + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Patient patient) {
		return this.priority - patient.priority;
	}
	
}
