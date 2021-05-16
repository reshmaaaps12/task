import java.sql.*;  
class Pgm1{  
	public static void main(String args[]){  
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","");   	
			Statement s=con.createStatement();  
			s.execute("create table employee(emp_id integer,name varchar(30),address varchar(50))");
			s.execute("insert into employee values(001,'Amal','kochi')");
			s.execute("insert into employee values(002,'Balu','idukki')");
			s.execute("insert into employee values(003,'David','kollam')");
			
			ResultSet rs=s.executeQuery("select * from employee"); 
			if(rs!=null)
			{
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