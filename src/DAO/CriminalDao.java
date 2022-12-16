package com.Dao;

import java.util.List;

import com.Bean.Criminal;
import com.Exception.CriminalException;

public interface CriminalDao {
	public String AddCriminal(Criminal c);
	
	public Criminal getcriminalByCId(int id) throws CriminalException;
	
	public List<Criminal> getCriminal() throws CriminalException;
	
	public String UpdateCriminal(Criminal c);

}
