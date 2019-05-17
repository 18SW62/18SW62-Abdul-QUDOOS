class Circle extends Shape{
	private double radius;
	public Circle(){
		radius=0.0;
	}
	public Circle(double radius){
		this.radius=radius;
	}
	public Circle(double radius,String color,boolean filled){
		super(color,filled);
		this.radius=radius;
	}
	public void setradius(double radius){
		this.radius=radius;
	}
	public double getradius(){
		return radius;
	}
	public double getarea(){
		double area=3.14*radius*radius;
		return area;
	}
	public double getperimeter(){
		double perimeter=2*3.14*radius;
		return perimeter;
	}
	public String tostring(){
		System.out.println("Circle[shape[radius="+radius+",color="+this.getcolor()+",filled="+this.isfilled()+"]");
		return null;
	}



}