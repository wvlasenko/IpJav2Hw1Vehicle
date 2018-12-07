package prj02;

public class Program {

	public static void main(String[] args) {
		CCar car1 = new CCar(-79, 83, 110, 20000, 2008);
		//System.out.println(car1);
		CPlane jet1 = new CPlane(128,12,800,200000,2008,0,0);
		jet1.setHeight(1800);
		jet1.setCapacity(35);
		//System.out.println(jet1);
		CPlane jet2 = new CPlane(-85,48,985,250000,2012,0,0);
		jet2.setHeight(3200);
		jet2.setCapacity(400);
		//System.out.println(jet2);
		CShip sh1 = new CShip(128,18,30,400000000,1999);
		sh1.setHomePort("York");
		sh1.setCapacity(800);
		//System.out.println(sh1);
		CVehicle[] masVehicle = new CVehicle[4];
		masVehicle[0]=car1;
		masVehicle[1]=jet1;
		masVehicle[2]=jet2;
		masVehicle[3]=sh1;
		
		for (int i=0;i<masVehicle.length;i++) {
			System.out.println(masVehicle[i]);
		}
	}

}
