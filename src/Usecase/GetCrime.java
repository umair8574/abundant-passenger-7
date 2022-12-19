package com.Usecase;

import java.util.List;

import com.bean_classes	.Crime;
import com.DAO.CrimeDao;
import com.DAO.CrimeDaoImp;
import com.Exception.CrimeException;

public class GetCrime {
	
public static void GetCrimeRecord() {
		
		CrimeDao dao = new CrimeDaoImp();
		
		try {
		List<Crime> criminals= dao.GetCrimeRecord();
		
		criminals.forEach(q ->{
			
			System.out.println("Crime Id :"+q.getCrid());
			System.out.println("Crime Date : "+q.getCdate());
			System.out.println("Crime Place: "+q.getCrplace());
			System.out.println("Crime Name: "+q.getCrname());
			System.out.println("Crime Victims: "+q.getVictims());
			System.out.println("Crime Description: "+q.getDescription());
			System.out.println("Crime Suspected name : "+q.getSuspected_name());
			System.out.println("Crime Case Status: "+q.getCase_Status());
			
			System.out.println("================================================");
			
			System.out.println();
			
			
		});
		
		}catch(CrimeException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}

}
