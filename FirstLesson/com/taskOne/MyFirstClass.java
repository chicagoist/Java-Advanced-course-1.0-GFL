package com.taskOne;

public class MyFirstClass {
  
	private Integer id = 0;
	private String status = "Empty";


	public MyFirstClass (String status, Integer id) {
	
		this.status = status;
		this.id = id;
	}


        public void setId (Integer id) {
	
		this.id = id;
	}

	public int getId() {
	
		return id;
	}



	public void setStatus (String status) {
	
		this.status = status;
		
	}

	public String getStatus () {
	
		return status;
	}




}
