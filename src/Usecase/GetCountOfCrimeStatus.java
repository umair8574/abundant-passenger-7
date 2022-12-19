package com.Usecase;

import java.util.Scanner;

import com.DAO.CrimeDao;
import com.DAO.CrimeDaoImp;
import com.Exception.CrimeException;

public class GetCountOfCrimeStatus {


	public static void CountOfCrimeStatus() {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the value of Case status");
		String s=sc.next();
		CrimeDao dao = new CrimeDaoImp();
		try {
		int c=dao.CountOfCrimeStatus(s);
		System.out.println("Total Number of soved/Unsolved Cases : "+c);	
			
		} catch (CrimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
