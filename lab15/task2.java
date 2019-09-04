import java.sql.*;

import javax.swing.JOptionPane;

class Example{
    public static void main(String[]args)
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop-lab15","root","");

            String []r = {"18SW70","17SW62","18SW84","16SW64","16SW66"};
            String []n = {"Uzair","Qudoos","Shoukat","Jabbar","Ali"};
            int []b = {18,18,18,18,18};
            String []d = {"Software","Software","Software","Software","Software"};
            String []y = {"First","First","First","First","First"};
            int []s = {2,4,2,7,7};
            PreparedStatement ps;
            for(int i=0;i<5;i++){
                ps = con.prepareStatement("insert into students(rollnum,name,batch,dept,year,semester) values(?,?,?,?,?,?)");
                ps.setString(1, r[i]);
                ps.setString(2, n[i]);
                ps.setInt(3, b[i]);
                ps.setString(4, d[i]);
                ps.setString(5, y[i]);
                ps.setInt(6, s[i]); 
                ps.executeUpdate();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}