package com.capgemini.model.dto;

import java.util.Date;

public class CallDto {

	private int call;
	private  Date callDate;
	private double callDuration;
	private String phoneNumber;
	public CallDto(int call, Date callDate, double callDuration, String phoneNumber) {
		super();
		this.call = call;
		this.callDate=callDate;
		this.callDuration = callDuration;
		this.phoneNumber = phoneNumber;
	}
	
	
	@Override
	public String toString() {
		return "CallDto [call=" + call + ", Date=" + callDate + ", callDuration=" + callDuration + ", phoneNumber="
				+ phoneNumber + "]";
	}


	public int getCall() {
		return call;
	}
	public void setCall(int call) {
		this.call = call;
	}
	public Date getDate() {
		return callDate;
	}
	public void setDate(Date callDate) {
		this.callDate=callDate;
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
	
	
}