package Car_Park;

public class carpark {
	String carnum;
	String name;
	String cellno;
	String placeno;
	String startTime;
	String duration;
	String date;
	public carpark() {
		carnum= null;
		name=null;
		cellno=null;
		placeno=null;
		startTime=null;
		duration=null;
		date=null;
	
	}
	
	public carpark(String carnum, String name, String cellno, String placeno, String startTime, String duration,String date) {
		this.carnum = carnum;
		this.name = name;
		this.cellno = cellno;
		this.placeno = placeno;
		this.startTime = startTime;
		this.duration = duration;
		this.date = date;
	}

	public String toString() {
		return carnum + ", " + name + ", " + cellno +","+placeno+ ","+startTime+","+duration+","+date;
	}
	


}
