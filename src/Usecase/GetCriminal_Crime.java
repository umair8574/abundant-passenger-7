package com.Usecase;

import java.util.List;
import java.util.Scanner;

import com.bean_classes.Criminal;
import com.DAO.Criminal_CrimeDao;
import com.DAO.Criminal_CrimeDaoImp;
import com.Exception.CriminalException;

public class GetCriminal_Crime {
	
	public static void CriminalCrimeRecord() {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter Crime Name : ");
		
		String cr=sc.next();
		
		Criminal_CrimeDao dao = new Criminal_CrimeDaoImp();
		
		try {
		List<Criminal> criminals= dao.GetCriminal_Crime(cr);
		
		criminals.forEach(s ->{
			
			
			System.out.println("Criminal name: "+s.getCname());
			System.out.println("Criminal Crime Name: "+s.getCrname());
			
			System.out.println("================================================");
			
			System.out.println();
			
			
		});
		
		
		
		
		}catch(CriminalException se) {
			System.out.println(se.getMessage());
		}
		
		
		
		
		
	}

}
