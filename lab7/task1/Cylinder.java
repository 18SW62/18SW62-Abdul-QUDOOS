class Cylinder extends Circle{
	double height=0;
	public Cylinder(){
		height=0;
	}
	public Cylinder(double radius)
	{
		super(radius);
	}
	public Cylinder(double radius,double height){
		//this.radius=radius;
		super(radius);
		this.height=height;
	}
	public Cylinder(double radius,double height,String color){
		super(radius);
		this.setcolor("red");
		this.height=height;
		//this.color=color;
	}
	public void setheight(double height){
		this.height=height;
	}
	public double getheight(){
		return height;
	}
	public double getvolume(){

		double v=3.14*getradius()*getradius()*height;
		System.out.println("volume is "+v);
		return v=0.0;
	}
}