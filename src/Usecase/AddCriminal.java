package com.Usecase;

import java.util.Scanner;

import com.bean_classes.Criminal;
import com.DAO.CriminalDao;
import com.DAO.CriminalDaoImp;

public class AddCriminal {

	public static void Addcriminal() {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter Criminal Name: ");
		String name=sc.next();
		
		System.out.println("Enter Criminal Age: ");
		int age=sc.nextInt();
		
		
		System.out.println("Enter Criminal Gender: ");
		String gender=sc.next();
		
		System.out.println("Enter Criminal Address : ");
		String address=sc.next();
		
		System.out.println("Enter Criminal Face Mark: ");
		String mark=sc.next();
		
		System.out.println("Enter Criminal crime Area : ");
		String area=sc.next();
		
		System.out.println("Enter Criminal crime Name : ");
		String crime=sc.next();
		
		
		CriminalDao dao=new CriminalDaoImp();

		Criminal criminal=new Criminal();
		
		
		
		
		
		String result= dao.AddCriminal(criminal);
		
		System.out.println(result);
		
	}

}
