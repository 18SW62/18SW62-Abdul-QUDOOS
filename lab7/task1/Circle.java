class Circle{
	private double radius;
	private String color;
	public Circle(){
		radius=1.0;
		color="red";
	}
	public Circle(double radius){
		this.radius=radius;
	}
	public Circle(double radius,String color){
		this.radius=radius;
		this.color=color;
	}
	public void setradius(double radius){
		this.radius=radius;
	}
	public double getradius(){
		double d=2*radius;
		radius=d/2;
		return radius;
	}
	public void setcolor(String color){
		this.color=color;
	}
	public String getcolor(){
		return color;
	}
	public double getArea(){
		double area=3.14*radius*radius;
		return area;
	}
	public String tostring(){
		System.out.println("Circle[radius="+radius+",color="+color+"]");
		return "";
	}
}
