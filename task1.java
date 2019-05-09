//import java.lang.Math;
 class Task1   
{    
private double hyp;
private double per;
private double base;
public double gethyp(double length,double angle){
	hyp=Math.hypot(length,angle);
	return hyp;
}
	public double getper(double hyp,double base){
	per=Math.sqrt(Math.pow(hyp,2)-Math.pow(base,2));
	return per;
}
	public double getbase(double hyp,double per){
	base=Math.sqrt(Math.pow(hyp,2)-Math.pow(per,2));
	return base;
}
}
class Mainclass{
	public static void main(String[] args) {
		Task1 m1=new Task1();
		System.out.println("hypotenuse is "+m1.gethyp(10,40));
		System.out.println("perpendicular is "+m1.getper(15,30));
		System.out.println("base is "+m1.getbase(20,40));
	}
}