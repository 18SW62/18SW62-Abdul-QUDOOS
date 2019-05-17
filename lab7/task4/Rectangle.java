class Rectangle extends Shape{
	private double width;
	private double length;
	public Rectangle(){
		width=1.0;
		length=1.0;
	}
	public Rectangle(double width,double length)
	{
		this.width=width;
		this.length=length;
	}
	public Rectangle(String color,boolean filled){
		super(color,filled);
	}
	public Rectangle(double length,double width,String color,boolean filled){
		super(color,filled);
		this.length=length;
		this.width=width;
		
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
		double area=length*width;
		return area;
	} 
	public double getperimeter(){
		double perimeter=2*(length*width);
		return perimeter;
	}
	public String tostring(){
		System.out.println("Rectangle[Circle[length="+length+",width="+width+",color="+this.getcolor()+",filled="+this.isfilled()+"]");
	return null;
	}
}