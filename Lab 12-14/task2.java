import javax.swing.*;
import java.awt.*;
class Example extends JFrame{
	BoxLayout box;
	JButton b1,b2;
	Container c;
	Example(){
		c=this.getContentPane();
		JPanel p1=new JPanel();
		box=new BoxLayout(p1,BoxLayout.X_AXIS);
		p1.setLayout(box);
		//b1=new JButton("Add");
		b2=new JButton("Subtract");
	//	p1.add(b1);
		p1.add(b2);
		c.add(p1);
		// pack();
	}
}
class Main{
	public static void main(String[] args) {
		Example e1=new Example();
		e1.setVisible(true);
		e1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		e1.setBounds(100,100,500,200);
	}
}