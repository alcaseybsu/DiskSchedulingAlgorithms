import java.util.List;

/**
 * This class will implement the C-SCAN
 * disk scheduling algorithm.
 * 
 * @author ...
 */
public class CSCAN implements IDiskAlgorithm {

	@Override
	public int calculateDistance(List<DiskRequest> requests, int headPosition) {
		int totalDistance = 0;

		// sort requests based on track
		requests.sort((r1, r2) -> Integer.compare(r1.getTrack(), r2.getTrack()));

		// find position of first request that is on or after headPosition
		int splitPoint = 0;
		while (splitPoint < requests.size() && requests.get(splitPoint).getTrack() < headPosition) {
			splitPoint++;
		}

		// process requests that are after headPosition
		for (int i = splitPoint; i < requests.size(); i++) {
			totalDistance += Math.abs(headPosition - requests.get(i).getTrack());
			headPosition = requests.get(i).getTrack();
		}

		// move head to the start
		totalDistance += Math.abs(headPosition - 0);
		headPosition = 0;

		// process requests that are before headPosition
		for (int i = 0; i < splitPoint; i++) {
			totalDistance += Math.abs(headPosition - requests.get(i).getTrack());
			headPosition = requests.get(i).getTrack();
		}

		return totalDistance;
	}
}
