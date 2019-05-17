class task4{
	public static void main(String[] args) {
	Rectangle r1=new Rectangle(8.0,9.0,"red",true);
	r1.tostring();
	System.out.println("Area of rectangle is="+r1.getarea());
	System.out.println("perimeter of rectangle is="+r1.getperimeter());
	System.out.println();
	Circle c1=new Circle(4.0,"purple",true);
	c1.tostring();
	System.out.println("Area of circle is"+c1.getarea());
	System.out.println("perimeter of circle is"+c1.getperimeter());
	System.out.println();
	Square s1=new Square(4.0,"green",true);
	s1.tostring();
	System.out.println("side of sqaure is "+s1.getside());


}
}