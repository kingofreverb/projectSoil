package com.kingofreverb.core;

import java.util.List;

//page should have components.
public interface ISoilPage {
	List<ISoilComponent> getComponents();
	String draw();
}
