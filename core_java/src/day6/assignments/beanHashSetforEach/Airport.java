package day6.assignments.beanHashSetforEach;

public class Airport {
	private int num;
	private String name;
	private String time;
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Airport(int num, String name,String time) {
		super();
		this.time = time;
		this.num = num;
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Airport [ num = " + num + ", name = " + name + ", time = " + time + " ] ";
	}
}
