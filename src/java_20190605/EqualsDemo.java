package java_20190605;

class Car {
	String modelNumber;
	String color;
	int year;
	
	static Car car;
	private Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//매개변수 있는 생성자:  alt+shift+s => o => ok
	//디폴트 생성자: alt+shit+s => c => ok
	public Car(String modelNumber, String color, int year) {
		super();
		this.modelNumber = modelNumber;
		this.color = color;
		this.year = year;
	}
	
	//setter, getter : alt+shift+s => r => ok
	
	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}



public class EqualsDemo {


	public void main(String[] args) {
		
	
	Car c1 = new Car ("010101000", "black", 2018);
	Car c2 = new Car ("010101000", "black", 2018);
	Car c3 = new Car ("010101001", "red", 2019);
	Car c4 = new Car ("010101001", "red", 2019);
	
	
	
	//equals and hashcode alt+shift+s = h
	
	
	System.out.println(c1==c2);
	System.out.println(c1.equals (c2));
	System.out.println("c1 hashCode: " + c1.hashCode());
	System.out.println("c2 hashCode: " + c2.hashCode());
	
	System.out.println(c3==c4);
	System.out.println(c3.equals (c4));
	System.out.println("c3 hashCode: " + c3.hashCode());
	System.out.println("c4 hashCode: " + c4.hashCode());
	
	
	//toString() = alt+shift+s =>s
	
	
	}
	

	}

}
