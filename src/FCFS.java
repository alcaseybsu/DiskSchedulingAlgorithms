import java.util.List;

/**
 * This class will implement the First Come First Serve 
 * disk scheduling algorithm.
 * 
 * @author ...
 */
public class FCFS implements IDiskAlgorithm {

	@Override
	public int calculateDistance(List<DiskRequest> requests, int headPosition) {
		int totalDistance = 0;
		
		// for each request, add the distance from the current head position
		for (DiskRequest request : requests) {
			totalDistance += Math.abs(headPosition - request.getTrack());
			// update the head position
			headPosition = request.getTrack();
		}
		return totalDistance;
	}

}
