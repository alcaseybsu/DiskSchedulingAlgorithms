import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<DiskRequest> requests1 = new ArrayList<DiskRequest>();
		requests1.add(new DiskRequest(3, 0));
		requests1.add(new DiskRequest(6, 0));
		requests1.add(new DiskRequest(1, 0));
		requests1.add(new DiskRequest(0, 0));
		requests1.add(new DiskRequest(7, 0));
		
		IDiskAlgorithm diskAlgorithm;

		diskAlgorithm = new FCFS();		
		System.out.println("FCFS total head movement for requests " + requests1 + ": " + diskAlgorithm.calculateDistance(requests1, 0));

		// testing
		diskAlgorithm = new SCAN();
        System.out.println("SCAN total head movement for requests " + requests1 + ": " + diskAlgorithm.calculateDistance(requests1, 0));
        
        diskAlgorithm = new CSCAN();
        System.out.println("CSCAN total head movement for requests " + requests1 + ": " + diskAlgorithm.calculateDistance(requests1, 0));
	}
	
}
