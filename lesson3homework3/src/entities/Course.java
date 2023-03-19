package entities;

public class Course {
	int id;
	String courseName;
	double Price;
	public Course() {
	
	}
	public Course(int id, String courseName, double price) {
	
		this.id = id;
		this.courseName = courseName;
		Price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
		
}
