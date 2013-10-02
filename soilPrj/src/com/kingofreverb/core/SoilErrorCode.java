package com.kingofreverb.core;

public enum SoilErrorCode {
	CANNOT_DISPATH("cannot dispath.");

	private String errorMessage;

	private SoilErrorCode(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public String getErrorMessage(){
		return this.errorMessage;
	}
	
}
