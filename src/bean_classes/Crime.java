package com.Bean;

public class Crime {
	
	

		  int Crid ;         
		  String Cdate ;          
		  String Crplace ;       
		  String crname ;        
		  String Victims;       
		  String Description;     
		  String  Suspected_name ;  
		  String Case_Status  ;


		public Crime() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Crime(int crid, String cdate, String crplace, String crname, String victims, String description,
				String suspected_name, String case_Status) {
			super();
			Crid = crid;
			Cdate = cdate;
			Crplace = crplace;
			this.crname = crname;
			Victims = victims;
			Description = description;
			Suspected_name = suspected_name;
			Case_Status = case_Status;
		}


		public int getCrid() {
			return Crid;
		}


		public void setCrid(int crid) {
			Crid = crid;
		}


		public String getCdate() {
			return Cdate;
		}


		public void setCdate(String cdate) {
			Cdate = cdate;
		}


		public String getCrplace() {
			return Crplace;
		}


		public void setCrplace(String crplace) {
			Crplace = crplace;
		}


		public String getCrname() {
			return crname;
		}


		public void setCrname(String crname) {
			this.crname = crname;
		}


		public String getVictims() {
			return Victims;
		}


		public void setVictims(String victims) {
			Victims = victims;
		}


		public String getDescription() {
			return Description;
		}


		public void setDescription(String description) {
			Description = description;
		}


		public String getSuspected_name() {
			return Suspected_name;
		}


		public void setSuspected_name(String suspected_name) {
			Suspected_name = suspected_name;
		}


		public String getCase_Status() {
			return Case_Status;
		}


		public void setCase_Status(String case_Status) {
			Case_Status = case_Status;
		}


		@Override
		public String toString() {
			return "Crime [Crid=" + Crid + ", Cdate=" + Cdate + ", Crplace=" + Crplace + ", crname=" + crname
					+ ", Victims=" + Victims + ", Description=" + Description + ", Suspected_name=" + Suspected_name
					+ ", Case_Status=" + Case_Status + ", getCrid()=" + getCrid() + ", getCdate()=" + getCdate()
					+ ", getCrplace()=" + getCrplace() + ", getCrname()=" + getCrname() + ", getVictims()="
					+ getVictims() + ", getDescription()=" + getDescription() + ", getSuspected_name()="
					+ getSuspected_name() + ", getCase_Status()=" + getCase_Status() + "]";
		}

		

	
		}



