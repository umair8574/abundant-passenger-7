package com.Usecase;

import java.util.List;
import com.bean_classes.Criminal;
import com.DAO.CriminalDao;
import com.DAO.CriminalDaoImp;
import com.Exception.CriminalException;

public class GetCriminal {
	
public static void getCriminal() {
		
		CriminalDao dao = new CriminalDaoImp();
		
		Criminal c=new Criminal();
		try {
			
		List<Criminal> criminals= dao.getCriminal();
		
		criminals.forEach(q ->{
			
			System.out.println("Criminal Id :"+q.getCid());
			System.out.println("Criminal name: "+q.getCname());
			System.out.println("Criminal Age: "+q.getCage());
			System.out.println("Criminal Gender: "+q.getGender());
			System.out.println("Criminal Address: "+q.getAddress());
			System.out.println("Criminal Face Mark: "+q.getFacemark());
			System.out.println("Criminal Crime Area: "+q.getCarea());
			System.out.println("Criminal Crime Name: "+q.getCrname());
			
			System.out.println("================================================");
			
			System.out.println();
			
			
		});
		
		
		
		
		}catch(CriminalException se) {
			System.out.println(se.getMessage());
		}
		
		
		
		
		
	}

}
