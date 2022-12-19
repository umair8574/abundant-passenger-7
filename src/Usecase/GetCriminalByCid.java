package com.Usecase;

import java.util.Scanner;

import com.bean_classes.Criminal;
import com.DAO.CriminalDao;
import com.DAO.CriminalDaoImp;
import com.Exception.CriminalException;

public class GetCriminalByCid {
	
	

		
		public static void ViewCriminalById() {
			
			Scanner sc=new Scanner (System.in);
			
			System.out.println("Enter the Criminal Id");
			int id=sc.nextInt();
			
			CriminalDao dao=new CriminalDaoImp();
			
			try {
				Criminal q=dao.getcriminalByCId(id);
				
				
				
				System.out.println("Criminal Id :"+q.getCid());
				System.out.println("Criminal name: "+q.getCname());
				System.out.println("Criminal Age: "+q.getCage());
				System.out.println("Criminal Gender: "+q.getGender());
				System.out.println("Criminal Address: "+q.getAddress());
				System.out.println("Criminal Face Mark: "+q.getFacemark());
				System.out.println("Criminal Crime Area: "+q.getCarea());
				System.out.println("Criminal Crime Name: "+q.getCrname());
				System.out.println();
				
				System.out.println();
			
			} catch (CriminalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

}
