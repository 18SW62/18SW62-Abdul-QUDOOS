 class Square extends Rectangle{
 	private double side;
 	public Square(){
 		side=1.0;
 	}
 	public Square(double side,String color,boolean filled){
 		this.getcolor();
 		this.getfilled();
 		this.side=side;
 	}
 	public void setside(double side){
 		this.side=side;
 	}
 	public double getside(){
 		return side;
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
 	public String tostring(){
 		System.out.println("Sqaure[Rectangle[Shape[color="+this.getcolor()+",side="+side+",filled="+this.getfilled()+"]");
 		return null;
 	}
 }