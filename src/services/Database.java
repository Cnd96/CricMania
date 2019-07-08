package services;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	 private java.sql.Connection con;
	    private Statement st;
	    
	    static Database connection = null;

	    public static Database getInstance(){
	        if(connection==null){
	            connection=new Database();
	        }
	        return connection;
	    }
	    private Database(){
	    try
	    {
	        Class.forName("com.mysql.jdbc.Driver");
	        this.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket","root","");

	    }catch(Exception e){
	         System.out.println(e);
	    }
	    }
	    
	    
	    public ResultSet search(String Quary)// throws SQLException
	    {   ResultSet rs=null;
	        try
	        {
	            PreparedStatement prepareStatement=this.con.prepareStatement(Quary);
	            rs=prepareStatement.executeQuery();
	        }
	        catch(SQLException e){
	            System.out.println(e+"searcherror");
	        } 
	        catch(Exception e){
	            System.out.println(e+"searcherror");
	        }
	    return rs;    
	    } 
	    
	    
	    public int update(String Quary) throws SQLException
	    {   int re=-1; 
	        try 
	        {
	        	st=con.createStatement();
	        	re= st.executeUpdate(Quary); //con.close();     
	        }
	        catch(SQLException e){
	        	
	        } 
	           
	        return re;
	    }
}
