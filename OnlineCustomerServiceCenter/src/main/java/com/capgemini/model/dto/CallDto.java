package com.capgemini.model.dto;

import java.util.Date;

public class CallDto {

	private int call;
	private CallDto Date;
	private double callDuration;
	private String phoneNumber;
	public CallDto(int call, CallDto date, double callDuration, String phoneNumber) {
		super();
		this.call = call;
		Date = date;
		this.callDuration = callDuration;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "CallDto [call=" + call + ", callDuration=" + callDuration + ", phoneNumber=" + phoneNumber + "]";
	}
	public int getCall() {
		return call;
	}
	public void setCall(int call) {
		this.call = call;
	}
	public CallDto getDate() {
		return Date;
	}
	public void setDate(CallDto date) {
		Date = date;
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