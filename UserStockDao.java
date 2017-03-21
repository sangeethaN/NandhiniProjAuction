package main;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.derby.client.am.SqlException;



public class UserStockDao {
	

	public void add(String name,String[] company) {
		
		String str="insert into T_COMITID_COMP values(?,?,?)";
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Calendar calobj = Calendar.getInstance();
		String dat=df.format(calobj.getTime());
		Connection con=ConnectionManager.getConnection();
		List holdingsList = null;
		PreparedStatement stmt=null;
		System.out.println(dat);		
		for(int i=0;i<company.length;i++)
				{
					
				
				
					
					
				try
				{
					stmt=con.prepareStatement(str);
					stmt.setString(1,company[i]);
					stmt.setString(2,dat);
					stmt.setString(3,name);
					stmt.executeUpdate();
					System.out.println("yes");
					
					
					/*holdingsList = new ArrayList<UserStockDao>();*/
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
					
					
					
					
					
					
					
					
					
					
					
					
				}
		
	}

	
}
