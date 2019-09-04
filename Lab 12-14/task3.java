import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Example1 extends JFrame implements ActionListener{
	Container c;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField f1,f2,f5,f6;
	JComboBox b1;
	JPasswordField p1,p2;
	JButton b2,b3;
	Example1(){
	c=this.getContentPane();
	c.setLayout(null);
	l1=new JLabel("Name");
	l1.setBounds(100,50,100,30);
	l2=new JLabel("Gender");
	l2.setBounds(100,100,100,30);
	l3=new JLabel("Father Name");
	l3.setBounds(100,150,100,30);
	l4=new JLabel("Password");
	l4.setBounds(100,200,100,30);
	l5=new JLabel("Confirm Password");
	l5.setBounds(100,250,150,30);
	l6=new JLabel("City");
	l6.setBounds(100,300,100,30);
	l7=new JLabel("Email");
	l7.setBounds(100,350,100,30);
	f1=new JTextField();
	f1.setBounds(250,50,100,30);
	f2=new JTextField();
	f2.setBounds(250,150,100,30);
	p1=new JPasswordField();
	p1.setBounds(250,200,100,30);
	p2=new JPasswordField();
	p2.setBounds(250,250,100,30);
	f5=new JTextField();
	f5.setBounds(250,300,100,30);
	f6=new JTextField();
	f6.setBounds(250,350,100,30);
	String x[]={"Male","Female"};
	b1=new JComboBox(x);
	b1.setBounds(250,100,100,40);
	b2=new JButton("Register");
	b2.setBounds(100,400,100,40);
	b3=new JButton("Reset");
	b3.setBounds(250,400,100,40);
	c.setBackground(Color.PINK);
	c.add(l1);
	c.add(l2);
	c.add(l3);
	c.add(l4);
	c.add(l5);
	c.add(l6);
	c.add(l7);
	c.add(f1);
	c.add(f2);
	c.add(p1);
	c.add(p2);
	c.add(f5);
	c.add(f6);
	c.add(b1);
	c.add(b2);
	c.add(b3);
	b2.addActionListener(this);
	b3.addActionListener(this);
	//c.add(f7);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource().equals(b2)){
		String a=f1.getText();
		String b=f2.getText();
		String c=p1.getText();
		String d=p2.getText();
		String f=f5.getText();
		String g=f6.getText();
		String gender=(String)b1.getSelectedItem();
		JOptionPane.showMessageDialog(null,"Name is="+a+"\n gender is= "+gender+"\nFather Name is="+b+"\nPassword is="+c+"\nConfirm Password is="+d+"\nEmail is="+f+"\nCity is="+g);
		}
		else if(e.getSource().equals(b3)){
			f1.setText("");
			f1.setText("");
			f5.setText("");
			f6.setText("");
			p1.setText("");
			p2.setText("");
			//b1.setText("");
		}
		}
}
class Main2{
	public static void main(String[] args) {
		Example1 e1=new Example1();
		e1.setBounds(100,100,700,700);
		e1.setVisible(true);
		e1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}