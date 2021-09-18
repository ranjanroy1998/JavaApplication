package com.CollectionFramwork;

import java.sql.*;

public class JdbcTest
{
 public static final String driverName  ="com.mysql.cj.jdbc.Driver";
 public static final String url= "jdbc:mysql://localhost:3306/Resturant_sytem";
 public static final String userName= "root";
 public static final String passWord= "Ranjan@0187";
 
 
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Connection con= null;
		PreparedStatement ps = null;
		ResultSet rs= null;
		
		try
		{
			Class.forName(driverName);
			con = DriverManager.getConnection(url,userName,passWord);
		    ps = con.prepareStatement("select *from resturant"); 
			rs = ps.executeQuery();
			System.out.println(con);
			while(rs.next())
			{
			
				System.out.println(rs.getString("name")+"\t");
				System.out.println(rs.getInt("opening_time")+"\t");
				System.out.println(rs.getInt("closing_time")+"\t");
				System.out.println(rs.getString("phone_no")+"\t");
                System.out.println(rs.getString("address")+"\t");
				System.out.println(rs.getString("status")+"\t");

				
			
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(rs != null)
				{
					ps.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}

	}

}