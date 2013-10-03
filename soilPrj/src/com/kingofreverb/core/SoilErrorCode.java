package com.kingofreverb.core;

public enum SoilErrorCode {
	
	CANNOT_DISPATH("cannot dispath."),
	ILLEGAL_PAGE("cannot instantiate,because the object generated doesn't have Page interface."),
	CANNOT_INSTANTIATE("cannot instantiate,something wrong with code or may be about to crack.");
	
	private String errorMessage;

	private SoilErrorCode(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public String getErrorMessage(){
		return this.errorMessage;
	}
	
}
