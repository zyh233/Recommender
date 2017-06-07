package cn.cumt.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetData extends JDBC{	

	
	public  int[] GetQ(int id){		
		int[] temp = new int[20];
		String sql="SELECT * FROM `recommender` WHERE ID='"+id+"'";																		
		try {			
			ResultSet resultSet=statement.executeQuery(sql);
			
			if(resultSet.next()){
				for(int i=0;i<20;i++)
				temp[i]=resultSet.getInt(i+2);								
			}
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return temp;		
	}
	
	public double GetP1(int id){		
		double temp = 0;
		String sql="SELECT `P1` FROM `recommender` WHERE ID='"+id+"'";																		
		try {			
			ResultSet resultSet=statement.executeQuery(sql);
			if(resultSet.next())
				temp=resultSet.getDouble(1);			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return temp;		
	}
	
	public double GetP2(int id){		
		double temp = 0;
		String sql="SELECT `P2` FROM `recommender` WHERE ID='"+id+"'";																	
		try {			
			ResultSet resultSet=statement.executeQuery(sql);
			if(resultSet.next())
				temp=resultSet.getDouble(1);			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return temp;		
	}
	
	public double GetP3(int id){		
		double temp = 0;
		String sql="SELECT `P3` FROM `recommender` WHERE ID='"+id+"'";																		
		try {			
			ResultSet resultSet=statement.executeQuery(sql);
			if(resultSet.next())
				temp=resultSet.getDouble(1);			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return temp;		
	}
	
	public double GetP4(int id){		
		double temp = 0;
		String sql="SELECT `P4` FROM `recommender` WHERE ID='"+id+"'";																	
		try {			
			ResultSet resultSet=statement.executeQuery(sql);
			if(resultSet.next())
				temp=resultSet.getDouble(1);			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return temp;		
	}

}
