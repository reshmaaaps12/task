import java.sql.*;  
class Pgm3{  
	public static void main(String args[]){  
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","");   	
			Statement s=con.createStatement();  
			s.execute("insert into employee values(008,'kavi','kochi')");
			s.execute("insert into employee values(009,'Lilly','idukki')");
			s.execute("insert into employee values(010,'Manu','kollam')");
			
			ResultSet rs=s.executeQuery("select * from employee"); 
			if(rs!=null)
			{
				System.out.println("Your table values are:");
				while(rs.next())  {
					System.out.println("-------------------------------------");
					System.out.println("Id:"+rs.getString(1));
					System.out.println("Id:"+rs.getString(2));
					System.out.println("Id:"+rs.getString(3));
					System.out.println("-------------------------------------");
				}
			}	 
			s.close();
			con.close();
		}catch(Exception e){ System.out.println(e);}  
	}  
}  