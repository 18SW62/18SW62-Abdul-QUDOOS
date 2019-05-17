class Square extends Rectangle{
	private double side;
	public Square(){
		side=1.0;
	}
	public Square(double side){
		this.side=side;
	}
	public Square(double side,String color,boolean filled){
		super(color,filled);
		this.side=side;
	}
	public void setside(double side){
		this.side=side;
	}
	public double getside(){
		return side*side;
	}
	public String tostring(){
		System.out.println("Square[Rectangle[shape[side="+side+",color="+this.getcolor()+",filled="+this.isfilled()+"]");
		return null;

}
}

