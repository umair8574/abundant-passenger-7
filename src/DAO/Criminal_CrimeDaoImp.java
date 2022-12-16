package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Bean.Criminal;
import com.Bean.Criminal_Crime;
import com.Exception.CriminalException;
import com.Utility.DBUtil;

public class Criminal_CrimeDaoImp implements Criminal_CrimeDao{

	@Override
	
	public String AddCriminalCrime(int crid, int cid) {
		String msg = "Not Inserted .....";
		try(Connection conn= DBUtil.getConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("insert into criminal_crime values(?,?)");
			ps.setInt(1, crid);
			ps.setInt(2, cid);
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				msg="Criminal crime added successfully !!";
			}
			else {
				msg="Unable To add Record ...";
			}
		
		}catch (SQLException e) {
			msg=e.getMessage();
		}
		return msg;
	}

	@Override
	public String DelectCrimeRecord(Criminal_Crime c) {
		
	       String msg="Not Updated....";
			
			try(Connection conn= DBUtil.getConnection()) {
				PreparedStatement ps = conn.prepareStatement("DELETE FROM Criminal_crime WHERE Cid=?");
				
			
				ps.setInt(1, c.getCid());
				ps.executeUpdate();
			
					msg="Data deleted Successfully";
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			return msg;
	}

	@Override
	public List<Criminal> GetCriminal_Crime(String a) throws CriminalException {
		List<Criminal> Criminals= new ArrayList<>();


		try(Connection conn= DBUtil.getConnection()) {
		
			PreparedStatement ps = conn.prepareStatement ("select c.cname, cr.crname from criminal"
					+ " c INNER JOIN crime cr INNER JOIN criminal_crime ccr ON ccr.crid=cr.crid "
					+ "AND ccr.cid=c.cid AND cr.crname=?");
			ps.setString(1,a );
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				
                       Criminal c=new Criminal();
			           c.setCname("Cname");
			           c.setCrname("Crname");
     
	    Criminals.add(c);
	
			}
			} catch (SQLException e) {
				throw new CriminalException(e.getMessage());
				
			}
			
			
			if(Criminals.size() == 0)
				throw new CriminalException("No Criminal crime found..");
			
			
			
			
			return Criminals;
	}

}
