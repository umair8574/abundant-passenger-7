package com.Usecase;

import java.util.List;
import java.util.Scanner;

import com.bean_classes.Crime;
import com.DAO.CrimeDao;
import com.DAO.CrimeDaoImp;
import com.Exception.CrimeException;

public class GetCrimeArea {
	
public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Crime Area : ");
		String a=sc.next();
	    CrimeDao dao = new CrimeDaoImp();
		
		try {
		List<Crime> criminals= dao.CrimeArea(a);
		
		criminals.forEach(s ->{
			
			System.out.println("Crime Id :"+s.getCrid());
			System.out.println("Crime Date : "+s.getCdate());
			System.out.println("Crime Place: "+s.getCrplace());
			System.out.println("Crime Name: "+s.getCrname());
			System.out.println("Crime Victims: "+s.getVictims());
			System.out.println("Crime Description: "+s.getDescription());
			System.out.println("Crime Suspected name : "+s.getSuspected_name());
			System.out.println("Crime Case Status: "+s.getCase_Status());
			
			System.out.println("================================================");
			
			System.out.println();
			
			
		});
		
		}catch(CrimeException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
