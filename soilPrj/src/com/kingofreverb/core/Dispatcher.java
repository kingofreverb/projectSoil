package com.kingofreverb.core;

import javax.servlet.http.HttpServletRequest;

/**
 * determine where to go.
 * @author egg
 * @since  0.1
 */
final class Dispatcher {
	
	void dispatch(HttpServletRequest req) throws SoilException{
		String nextPage = req.getParameter("nextPage");
		if(nextPage != null || nextPage.length() != 0){
			
		}else{
			//throw Exception
			throw new SoilException(SoilErrorCode.CANNOT_DISPATH);
		}
	}
}
