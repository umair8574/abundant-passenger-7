package com.Usecase;



import com.bean_classes.Crime;
import com.DAO.CrimeDao;
import com.DAO.CrimeDaoImp;
import com.Exception.CrimeException;


import java.util.Scanner;
public class AddCrime {

	
		public static void AddCrimeRecord() {
			
				Scanner sc= new Scanner (System.in);
				
				
				System.out.println("Enter Crime Date YYYY-MM-DD Format: ");
				String date=sc.nextLine();
				
				System.out.println("Enter Crime Place ");
				String p=sc.nextLine();
				
				
				System.out.println("Enter crime Name  ");
				String cn=sc.nextLine();
				
				System.out.println("Enter Victims Name  ");
				String victim=sc.nextLine();
				
				System.out.println("Enter Detail Description of crime ");
				String desc=sc.nextLine();
				
				System.out.println("Enter Crime Suspected name  ");
				String sus=sc.nextLine();
				
				CrimeDao dao=new CrimeDaoImp();
				  Crime c=new Crime();
				  c.setCdate(date);
                  c.setCrplace(p);
                  c.setCrname(cn);
			      c.setVictims(victim);
			      c.setDescription(desc);
			      c.setSuspected_name(sus);
			
				
				try {
					String result= dao.AddCrime(c);
					System.out.println(result);
				} catch (CrimeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
		}

}
