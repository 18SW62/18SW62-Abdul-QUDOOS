class Rectangle extends Shape{
	double width;
	double length;
	public Rectangle(){
		width=1.0;
		length=1.0;
	}
	public Rectangle(double width,double length){
		this.width=width;
		this.length=length;
	}
	public Rectangle(double width,double length,String color,boolean filled){
		super(color,filled);
		this.width=width;
		this.length=length;
	}
	public void setwidth(double width){
		this.width=width;
	}
	public double getwidth(){
		return width;
	}
	public void setlength(double length){
		this.length=length;
	}
	public double getlength(){
		return length;
	}
	public double getarea(){
		double area=width*length;
		return area;
	}
	public double getperimeter(){
		double perimeter=2*(length*width);
		return perimeter;
	}
	public String tostring(){
		System.out.println("Rectangle[Shape[color="+this.getcolor()+",filled="+this.getfilled()+",length="+length+",width="+width+"]");
		return null;
	}
}