package com.example.ToDo.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userLog")
public class UserLog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name="userid")
	private long userid;
	
	@Column(name = "date")
	private Date date;
	
	@Column(name = "inTime")
	private String inTime;
	
	@Column(name = "outTime")
	private String outTime;
	
	@Column(name = "hoursWorked")
	private String hoursWorked;
	
	@Column(name = "overtimePeriod")
	private String overtimePeriod;
	
	
	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getInTime() {
		return inTime;
	}


	public void setInTime(String inTime) {
		this.inTime = inTime;
	}


	public String getOutTime() {
		return outTime;
	}


	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}


	public String getHoursWorked() {
		return hoursWorked;
	}


	public void setHoursWorked(String hoursWorked) {
		this.hoursWorked = hoursWorked;
	}


	public String getOvertimePeriod() {
		return overtimePeriod;
	}


	public void setOvertimePeriod(String overtimePeriod) {
		this.overtimePeriod = overtimePeriod;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	
	
	
	
	
	
	

}
