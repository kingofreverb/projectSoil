package com.kingofreverb.core;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Very Core of Soil.
 * Soil want to be a backbone of Enterprise WEB application.
 */
@WebServlet("/SoilServlet")
public class SoilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SoilServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextPageFqcn = request.getParameter("nextPage");
		ISoilPage page = new Dispatcher().dispatch(nextPageFqcn);
		for (ISoilComponent component : page.getComponents()) {
			Coordinate coordiate = component.getCoordinate();
			ISoilComponentDrawer componentDrawer = component.getDrawer();
			componentDrawer.display();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
