package com.kingofreverb.core;

/**
 * SoilException is in charge of MOVE errors.
 * Such as cannot move to next page or something like that.
 * @author egg
 */
public class SoilException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private SoilErrorCode errCode;
	
	public SoilException(SoilErrorCode errCode){
		this.errCode = errCode;
	}
	
	//ó·äOèàóùópÅB
	public SoilErrorCode getErrorCode(){
		return this.errCode;
	}
}
