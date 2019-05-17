abstract class Shape{
	private String color;
	private boolean filled;
	public Shape(){
		color="red";
		filled=true;
	}
	public Shape(String color,boolean filled){
		this.color=color;
		this.filled=filled;
	}
	public void setcolor(String color){
		this.color=color;
	}
	public String getcolor(){
		return color;
	}
	public void setboolean(boolean filled){
		this.filled=filled;
	}
	public boolean isfilled(){
		return filled;
	}
	abstract public double getarea();
	abstract public double getperimeter();
	abstract public String tostring();
}
