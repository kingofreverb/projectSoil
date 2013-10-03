package com.kingofreverb.core;

import java.util.List;

final class HtmlBase {

	private static final String LS = System.getProperty("line.separator");
	private static String html = null;
	
	
	static void merge(String title,List<ISoilComponent> components){
		if (html == null) {
			StringBuilder h = new StringBuilder();
			t(h, "<!DOCTYPE html>");
			t(h, "<html>");
			t(h, "<head>");
			t(h, "<title>");
			h.append(title);
			t(h, "</title>");
			t(h, "</head>");
			t(h, "<body>");
//			h.append(makeBody(components));
			t(h, "</body>");
			t(h, "</html>");
			HtmlBase.html = h.toString();
		}
	}
	
//	private makeBody(List<ISoilComponent> components){
//		for (ISoilComponent component : components) {
//			component.get
//		}
//	}
	

	private static void t(StringBuilder h, String tag) {
		h.append(tag);
		h.append(LS);
	}

}
