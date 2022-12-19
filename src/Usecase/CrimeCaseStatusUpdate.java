package com.Usecase;

import java.util.Scanner;

import com.bean_classes.Crime;
import com.DAO.CrimeDao;
import com.DAO.CrimeDaoImp;
import com.Exception.CrimeException;

public class CrimeCaseStatusUpdate {
	

		public static void CaseSatatusUpdate() {
	    Scanner sc=new Scanner(System.in);
			
			System.out.println("Update Case Status: ");
			String Status=sc.next();
			
			System.out.println("Enter the crimId: ");
			int id=sc.nextInt();
			
			CrimeDao dao=new CrimeDaoImp();

			Crime c=new Crime();
			
			
			c.setCase_Status(Status);;
			c.setCrid(id);;
			
	      String result;
		try {
			result = dao.UpdateCrime(c);
			System.out.println(result);
		} catch (CrimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		}


}