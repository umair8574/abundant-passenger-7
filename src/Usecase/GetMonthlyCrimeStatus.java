package com.Usecase;

import java.util.Scanner;

import com.DAO.CrimeDao;
import com.DAO.CrimeDaoImp;
import com.Exception.CrimeException;

public class GetMonthlyCrimeStatus {

	public static void CurrentCrimeStatus() throws CrimeException {
	
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the  Date of the Month :");
		String d1=sc.next();
		System.out.println("Enter the Date of the Month End: ");
		String d2=sc.next();
		CrimeDao dao = new CrimeDaoImp();
		int c=dao.CurrentCrimeStatus(d1,d2);
		System.out.println("Number of crimes recorded in the current month : "+c);
	}
}
