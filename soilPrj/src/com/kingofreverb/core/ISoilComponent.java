package com.kingofreverb.core;

public interface ISoilComponent {
	Coordinate getCoordinate(); //where to drop.
	String getName();           //name of component.
	String getCss();	        //required css.
	String getJs();		        //required js.
	void operate(SoilComponentContext ctx);             //how it works.
	ISoilComponentDrawer getDrawer(); //how it present.
}
