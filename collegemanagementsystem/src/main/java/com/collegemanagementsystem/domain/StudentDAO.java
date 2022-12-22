package com.collegemanagementsystem.domain;

public class StudentDAO {
	
	private Long id;
	private String stname;
	//private String course;
	private String coursename;
	


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}
	
	
	/*public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}*/

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
	

}
