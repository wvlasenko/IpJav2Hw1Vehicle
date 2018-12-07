package prj02;

public abstract class CVehicle {
	private int latitude;
	private int longitude;
	//private int height;
	private int speed;
	private int price;
	private int yearOfIssue;
	//private int capacity;
	//private String homePort;
	public CVehicle() {
		this.latitude=0;
		this.longitude=0;
		//this.height=0;
		this.speed=0;
		this.price=0;
		this.yearOfIssue=0;
		//this.capacity=0;
		//this.homePort="";
		
	}
	public CVehicle(int latitude,int longitude,int speed,int price,int yearOfIssue) {
		this.latitude=latitude;
		this.longitude=longitude;
		//this.height=height;
		this.speed=speed;
		this.price=price;
		this.yearOfIssue=yearOfIssue;
	//	this.capacity=capacity;
		//this.homePort=homePort;
		
		
	}
	public int getLatitude() {
		return latitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	public int getLongitude() {
		return longitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getYearOfIssue() {
		return yearOfIssue;
	}
	public void setYearOfIssue(int yearOfIssue) {
		this.yearOfIssue = yearOfIssue;
	}
	@Override
	public String toString() {
		return "latitude=" + latitude + ", longitude=" + longitude + ", speed=" + speed + ", price=" + price
				+ ", yearOfIssue=" + yearOfIssue + "";
	}
	

	}
	

