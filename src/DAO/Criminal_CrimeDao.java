package com.Dao;

import java.util.List;

import com.Bean.Criminal;
import com.Bean.Criminal_Crime;
import com.Exception.CriminalException;

public interface Criminal_CrimeDao {
	public String AddCriminalCrime(int crid,int  cid) ;
	
	public String DelectCrimeRecord(Criminal_Crime c) throws CriminalException;
	public List<Criminal> GetCriminal_Crime(String a) throws CriminalException ;
	
	

}
