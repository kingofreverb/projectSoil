package com.kingofreverb.core;

final class InstanceGenerator {
	static ISoilPage getInstance(String fqcn) throws SoilException{
		try{
			Class<?> clz = Class.forName(fqcn);
			Object o = clz.newInstance();
			if(o instanceof ISoilPage){
				return (ISoilPage) o;
			}else{
				throw new SoilException(SoilErrorCode.ILLEGAL_PAGE);
			}
		}catch(ClassNotFoundException | 
			   InstantiationException | 
			   IllegalAccessException e){
			throw new SoilException(SoilErrorCode.CANNOT_INSTANTIATE);
		}
	}
}
