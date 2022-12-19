package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean_classes.Crime;
import com.Exception.CrimeException;
import com.Utility.DBUtil;

public class CrimeDaoImp implements CrimeDao {

	@Override
	public String AddCrime(Crime c) {
		// TODO Auto-generated method stub
String msg= "Not Insertd ....";
		
		

		try(Connection conn= DBUtil.getConnection()) {
			PreparedStatement ps = conn.prepareStatement
					("insert into crime (cdate, crplace,  crname, Victims, Description, suspected_name)"
												+ "values (?,?,?,?,?,?)");
			
			ps.setString(1,c.getCdate());
			ps.setString(2,c.getCrplace() );
			ps.setString(3,c.getCrname());
			ps.setString(4,c.getVictims());
			ps.setString(5,c.getDescription());
			ps.setString(6,c.getSuspected_name());
			
			
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				
				msg="Crime Added Sucessfully !";
			}
		} catch (SQLException e) {
		
			
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
		
		return msg;
	}

	@Override
	public String UpdateCrime(Crime c) {

		String msg="Not Updated....";
		
		try(Connection conn= DBUtil.getConnection()) { 
			PreparedStatement ps = conn.prepareStatement("update crime set case_status=? where crid=?");
				
			
			ps.setString(1, c.getCase_Status());
			ps.setInt(2, c.getCrid());
			int x=ps.executeUpdate();
			
		  if(x>0)
		   {
			  msg="Case Status Updated Successfully";
		   }
				
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return msg;
	}

	@Override
	public int CountOfCrimeStatus(String s) {
		int count=0;
		
		
		try(Connection conn= DBUtil.getConnection()) { 
			PreparedStatement ps = conn.prepareStatement ("select count(*) from crime where case_status=?");
				ps.setString(1,s);
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				
				count= rs.getInt("count(*)");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	return count;
	}

	@Override
	public List<Crime> CrimeArea(String a) throws CrimeException {
		List<Crime>l= new ArrayList<>();
		
		try(Connection conn= DBUtil.getConnection()) { 
			PreparedStatement ps = conn.prepareStatement ("select * from crime where crplace=?");
			
	          ps.setString(1, a);
				
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				int id= rs.getInt("crid");
				String d= rs.getString("cdate");
				String p= rs.getString("crplace");
				String n= rs.getString("Crname");
				String v= rs.getString("Victims");
				String ds= rs.getString("Description");
				String  s= rs.getString("suspected_name");
				String cs= rs.getString("case_Status");
				
				
			Crime cri=new Crime(id, d, p, n, v, ds, s, cs);
		    l.add(cri);
	    
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		if(l.size() == 0)
			throw new CrimeException("No crime found..");
	
		
		return l;

	}

	@Override
	public List<Crime> GetCrimeRecord() throws CrimeException {
		List<Crime> l= new ArrayList<>();


		try(Connection conn= DBUtil.getConnection()) { 
		
			PreparedStatement ps = conn.prepareStatement ("select * from crime");
			
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
			
				int id= rs.getInt("crid");
				String d= rs.getString("cdate");
				String p= rs.getString("crplace");
				String n= rs.getString("Crname");
				String v= rs.getString("Victims");
				String ds= rs.getString("Description");
				String  area= rs.getString("suspected_name");
				String cs= rs.getString("case_Status");
				
				
			Crime c=new Crime(id, d, p, n, v, ds, area, cs);
			
	        l.add(c);
	
			}
			} catch (SQLException e) {
				throw new CrimeException(e.getMessage());
				
			}
			
			
			if(l.size() == 0)
				throw new CrimeException("No crime found..");
		
			
			return l;
	}

	@Override
	public int CurrentCrimeStatus(String d1, String d2) {
            int count=0;
		
		
          try(Connection conn= DBUtil.getConnection()) { 
			PreparedStatement ps = conn.prepareStatement ("select count(*) from crime where cdate between ? AND ?");
				ps.setString(1,d1);
				ps.setString(2, d2);
		
				
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				
				count= rs.getInt("count(*)");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	return count;
	}

}
