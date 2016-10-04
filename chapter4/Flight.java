package chapter4;

public class Flight {
	private String airlineName, flightOrigin, flightDestination;
	int flightNumber;
	public Flight(int flightNumber, String airlineName, String flightOrigin, String flightDestination) {
		this.flightNumber = flightNumber;
		this.airlineName = airlineName;
		this.flightOrigin = flightOrigin;
		this.flightDestination = flightDestination;
	}
	
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getFlightOrigin() {
		return flightOrigin;
	}
	public void setFlightOrigin(String flightOrigin) {
		this.flightOrigin = flightOrigin;
	}
	public String getFlightDestination() {
		return flightDestination;
	}
	public void setFlightDestination(String flightDestination) {
		this.flightDestination = flightDestination;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String toString() {
		return "Flight [airlineName=" + airlineName + ", flightOrigin=" + flightOrigin + ", flightDestination="
				+ flightDestination + ", flightNumber=" + flightNumber + "]";
	}
}