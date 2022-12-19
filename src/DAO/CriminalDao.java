package com.DAO;

import java.util.List;

import com.bean_classes.Crime;
import com.Exception.CriminalException;

public interface CriminalDao {
	public String AddCriminal(Criminal c);
	
	public Criminal getcriminalByCId(int id) throws CriminalException;
	
	public List<Criminal> getCriminal() throws CriminalException;
	
	public String UpdateCriminal(Criminal c);

}
