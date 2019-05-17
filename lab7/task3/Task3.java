class Task3{
	public static void main(String[] args) {
		Square s1=new Square(1.0,"red",true);
		s1.tostring();
		Rectangle r1=new Rectangle(16.0,6.0,"blue",true);
		r1.tostring();
		Circle c1=new Circle(6.0,"purple",true);
		c1.tostring();
		Shape s2=new Shape("green",true);
		s2.tostring();
	}
}