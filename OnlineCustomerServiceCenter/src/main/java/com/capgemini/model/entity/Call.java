package com.capgemini.model.entity;

import java.util.Date;

public class Call {
	int callid;
	Date callDate;
	double callDuration;
	String phoneNumber;
	public Call(int callid, Date callDate, double callDuration, String phoneNumber) {
		super();
		this.callid = callid;
		this.callDate = callDate;
		this.callDuration = callDuration;
		this.phoneNumber = phoneNumber;
	}
	public int getCallid() {
		return callid;
	}
	public void setCallid(int callid) {
		this.callid = callid;
	}
	public Date getCallDate() {
		return callDate;
	}
	public void setCallDate(Date callDate) {
		this.callDate = callDate;
	}
	public double getCallDuration() {
		return callDuration;
	}
	public void setCallDuration(double callDuration) {
		this.callDuration = callDuration;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Call [callid=" + callid + ", callDate=" + callDate + ", callDuration=" + callDuration + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
}

