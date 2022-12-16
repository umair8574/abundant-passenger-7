package com.Bean;

public class Criminal_Crime {
	 
       int Crid;
       int Cid;
       
       public Criminal_Crime()
       {
    	   
       }

	public Criminal_Crime(int crid, int cid) {
		super();
		Crid = crid;
		Cid = cid;
	}

	public int getCrid() {
		return Crid;
	}

	public void setCrid(int crid) {
		Crid = crid;
	}

	public int getCid() {
		return Cid;
	}

	public void setCid(int cid) {
		Cid = cid;
	}

	@Override
	public String toString() {
		return "Criminal_Crime [Crid=" + Crid + ", Cid=" + Cid + ", getCrid()=" + getCrid() + ", getCid()=" + getCid()
				+ "]";
	}
       
       
		
		
	}



