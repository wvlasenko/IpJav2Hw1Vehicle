package prj02;

public class CCar extends CVehicle {

	public CCar() {
		super();
		
	}
	public CCar (int latitude,int longitude,int price,int speed ,int yearOfIssue) {
		super (latitude,longitude,price,speed ,yearOfIssue);
		
	}
	@Override
	public String toString() {
		return "CCar [" + super.toString() + "]";
	}
	
	
	}


