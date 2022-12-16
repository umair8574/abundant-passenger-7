package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Bean.Criminal;
import com.Exception.CriminalException;
import com.Utility.DBUtil;

public class CriminalDaoImp implements CriminalDao{

	@Override
	public String AddCriminal(Criminal c) {
String msg= null;
		
	
		
          try(Connection conn= DBUtil.getConnection()) {
			PreparedStatement ps = conn.prepareStatement
					("insert into criminal (Cname, Cage, Gender, Address, facemark, Carea, Crname) "
							+ "values (?,?,?,?,?,?,?)");
			
			ps.setString(1,c.getCname());
			ps.setInt(2, c.getCage());
			ps.setString(3,c.getGender());
			ps.setString(4,c.getAddress());
			ps.setString(5,c.getFacemark());
			ps.setString(6,c.getCarea());
			ps.setString(7,c.getCrname());
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				
				msg="Criminal Added Sucessfully !";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return msg;
	}

	@Override
	public Criminal getcriminalByCId(int i) throws CriminalException {
		
		Criminal c=null;

		 try(Connection conn= DBUtil.getConnection()) {
		
			PreparedStatement ps = conn.prepareStatement ("select * from criminal where cid=?");
			ps.setInt(1, i);
			
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
			
				int id= rs.getInt("Cid");
				String n= rs.getString("Cname");
				int a= rs.getInt("Cage");
				String g= rs.getString("Gender");
				String ad= rs.getString("Address");
				String fm= rs.getString("facemark");
				String  area= rs.getString("Carea");
				String crn= rs.getString("Crname");
				
				
			 c=new Criminal(id, n, a, g, ad, fm, area, crn);
			
	  
	
			}
			} catch (SQLException e) {
				throw new CriminalException(e.getMessage());
				
			}
			
			
			
			
			
			return c;
	}

	@Override
	public List<Criminal> getCriminal() throws CriminalException {
		List<Criminal> list= new ArrayList<>();


		 try(Connection conn= DBUtil.getConnection()) {
		
			PreparedStatement ps = conn.prepareStatement ("select * from criminal");
			
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
			
				int id= rs.getInt("Cid");
				String n= rs.getString("Cname");
				int a= rs.getInt("Cage");
				String g= rs.getString("Gender");
				String ad= rs.getString("Address");
				String fm= rs.getString("facemark");
				String  area= rs.getString("Carea");
				String crn= rs.getString("Crname");
				
				
			Criminal cri=new Criminal(id, n, a, g, ad, fm, area, crn);
			
	   list.add(cri);
	
			}
			} catch (SQLException e) {
				throw new CriminalException(e.getMessage());
				
			}
			
			
			if(list.size() == 0)
				throw new CriminalException("No Criminal found..");
			
			
			
			
			return list;
	}

	@Override
	public String UpdateCriminal(Criminal c) {
          String msg=null;
		
          try(Connection conn= DBUtil.getConnection()) {
			PreparedStatement ps = conn.prepareStatement("update criminal set Cname=? where Cid=?");
			
			ps.setString(1,c.getCname() );
			ps.setInt(2,c.getCid() );
			ps.executeUpdate();
			
		
				
				msg="Table Updated Successfully";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return msg;
	}

}
