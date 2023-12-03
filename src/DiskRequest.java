
public class DiskRequest {

	private int track;
	private int timeOfArrival;

	public DiskRequest(int track, int timeOfArrival) {
		super();
		this.track = track;
		this.timeOfArrival = timeOfArrival;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		if (track < 0 || track > 4999) {
			throw new IllegalArgumentException("Track must be between 0 and 4999");
		}
		this.track = track;
	}

	public int getTimeOfArrival() {
		return timeOfArrival;
	}

	public void setTimeOfArrival(int timeOfArrival) {
		this.timeOfArrival = timeOfArrival;
	}

	// make output make sense
	@Override
	public String toString() {
		return "DiskRequest { track = " + track + ", timeOfArrival = " + timeOfArrival + " }";
	}
}
