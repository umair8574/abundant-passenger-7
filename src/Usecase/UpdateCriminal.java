package com.Usecase;

import java.util.Scanner;

import com.bean_classes.Criminal;
import com.DAO.CriminalDao;
import com.DAO.CriminalDaoImp;

public class UpdateCriminal {
	
public static void Updatecriminal() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Name: ");
		String name=sc.next();
		
		System.out.println("Enter the Cid: ");
		int id=sc.nextInt();
		
		CriminalDao dao=new CriminalDaoImp();

		Criminal criminal=new Criminal();
		
		
		criminal.setCname(name);
		criminal.setCid(id);
		
      String result= dao.UpdateCriminal(criminal);
		
		System.out.println(result);
		
		
	}

}
