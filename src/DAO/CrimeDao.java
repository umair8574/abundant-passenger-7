package com.Dao;

import java.util.List;

import com.Bean.Crime;
import com.Exception.CrimeException;

public interface CrimeDao {
	public String AddCrime(Crime c) throws CrimeException;
	public String UpdateCrime(Crime c) throws CrimeException;
	public int CountOfCrimeStatus(String s) throws CrimeException;
	public List<Crime> CrimeArea(String a) throws CrimeException;
	public List<Crime> GetCrimeRecord() throws CrimeException;

	public int CurrentCrimeStatus(String d1,String d2);
}
