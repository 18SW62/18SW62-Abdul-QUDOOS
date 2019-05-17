class Shape{
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
	public void setfilled(boolean filled){
		this.filled=filled;
	}
	public boolean getfilled(){
		return filled;
	}
	public String tostring(){
		System.out.println("shape[color="+color+",filled="+filled+"]");
		return null;
	}
}