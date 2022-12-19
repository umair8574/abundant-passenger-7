package com.Usecase;

import java.util.Scanner;

import com.bean_classes.Criminal_Crime;
import com.DAO.Criminal_CrimeDao;
import com.DAO.Criminal_CrimeDaoImp;
import com.Exception.CriminalException;

public class DeleteCriminalCrime {
	
public static void DelectCrimeRecord() {
		
		
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Criminal id: ");
		int id=sc.nextInt();
		
		Criminal_CrimeDao dao=new Criminal_CrimeDaoImp();

		Criminal_Crime crime=new Criminal_Crime();
	
		crime.setCid(id);
		
      String result;
	try {
		result = dao.DelectCrimeRecord(crime);
		System.out.println(result);
	} catch (CriminalException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
		
	
	
}

}
