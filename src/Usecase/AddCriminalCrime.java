package com.Usecase;

import java.util.Scanner;

import com.DAO.Criminal_CrimeDao;
import com.DAO.Criminal_CrimeDaoImp;
import com.Exception.CriminalException;

public class AddCriminalCrime {

public static void AddCriminalCrime() throws CriminalException{
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter Crime Id: ");
		int crimeid=sc.nextInt();
		
		System.out.println("Enter Criminal Id: ");
		int cid=sc.nextInt();
		
		
		Criminal_CrimeDao dao=new Criminal_CrimeDaoImp();
		
		String res;
		res = dao.AddCriminalCrime(crimeid, cid);
		 System.out.println(res);
		
	}
}
