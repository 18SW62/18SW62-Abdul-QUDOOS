import java.sql.*;

public class MyDatabase{
    public static void main(String[]args)
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab15","root","");
            
            PreparedStatement ps=con.prepareStatement("update students set name='Abdul Qudoos Soomro' WHERE rollnum='18SW62");
            ps.executeUpdate(); //I am updatin just my name not all data
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
