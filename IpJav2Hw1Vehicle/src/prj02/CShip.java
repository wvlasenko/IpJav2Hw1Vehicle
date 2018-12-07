package prj02;

public class CShip extends CVehicle {
	private String homePort;
	private int capacity;

	public CShip() {
		super();
		// this.homePort ="";
		// this.capacity = 0;

	}

	public CShip(int latitude, int longitude, int speed, int price, int yearOfIssue) {
		super(latitude, longitude, speed, price, yearOfIssue);
		this.homePort = homePort;
		this.capacity = capacity;

	}

	public String getHomePort() {
		return homePort;
	}

	public void setHomePort(String homePort) {
		this.homePort = homePort;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "CShip [" + super.toString() + ", homePort=" + homePort + ", capacity=" + capacity + "]";
	}
}