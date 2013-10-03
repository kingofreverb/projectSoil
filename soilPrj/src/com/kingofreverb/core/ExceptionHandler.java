package com.kingofreverb.core;

import java.util.logging.Logger;

/**
 * expcetion handle.
 * default behavior is logging.
 * @author egg
 */
final class ExceptionHandler {
		
	public ExceptionHandler(){
		//do nothing.
	}
	
	public void handle(SoilException e,String className){
		Logger log = Logger.getLogger(className);
		log.severe(e.getErrorCode().getErrorMessage());
	}
	
}
