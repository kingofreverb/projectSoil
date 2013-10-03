package com.kingofreverb.core;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;


/**
 * determine where to go.
 * @author egg
 * @since  0.1
 */
final class Dispatcher {
	
	private static final Logger log = Logger.getLogger(Dispatcher.class.getName());
	
	ISoilPage dispatch(String nextPageFqcn){
		try{
			if(nextPageFqcn != null && nextPageFqcn.length() != 0){
				log.info("try to dispatch :" + nextPageFqcn);
				return InstanceGenerator.getInstance(nextPageFqcn);
			}else{
				//throw Exception
				log.severe("fqcn is null or empty");
				throw new SoilException(SoilErrorCode.CANNOT_DISPATH);
			}
		}catch(SoilException e){
			//nextPage should be the class_name.
			new ExceptionHandler().handle(e,nextPageFqcn);
		}
		return null;
	}
}
