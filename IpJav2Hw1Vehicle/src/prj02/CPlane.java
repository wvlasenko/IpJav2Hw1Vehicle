package prj02;

public class CPlane extends CVehicle {
private int height;
private int capacity;
	public CPlane() {
		super();
		this.height=0;
		this.capacity=0;
	}

	public CPlane(int latitude, int longitude, int speed, int price, int yearOfIssue,int height,int capacity ) {
		super(latitude, longitude, speed, price, yearOfIssue);
		this.height=height;
		this.capacity=capacity;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "CPlane [" + super.toString() + ", height=" + height + ", capacity=" + capacity + "]";
	}

	
	}


	



