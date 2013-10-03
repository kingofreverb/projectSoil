package com.kingofreverb.core;


public abstract class Page implements ISoilPage {

	@Override
	public String draw() {
		for (ISoilComponent component : getComponents()) {
			
		}
		return null;
	}

}
