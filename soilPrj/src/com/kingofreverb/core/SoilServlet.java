package com.kingofreverb.core;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Very Core of Soil. Soil want to be a backbone of Enterprise WEB application.
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

	static final String DEFAULT_FOOTER_JSP = "footer.jsp";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = this.getServletContext();
		try {
			String nextPageFqcn = request.getParameter("nextPage");
			ISoilPage page = new PageFixer().dispatch(nextPageFqcn);
			PageFragment fragment = page.getClass().getAnnotation(
					PageFragment.class);
			if (fragment == null) {
				throw new SoilException(
						SoilErrorCode.SHOULD_HAVE_FRAGMENT_ANNOTATION);
			}
			// handle component.
			if (page.getComponents() != null) {
				for (ISoilComponent component : page.getComponents()) {
					// Coordinate coordiate = component.getCoordinate();
					ISoilComponentDrawer componentDrawer = component
							.getDrawer();
					request.setAttribute(component.getName(),
							componentDrawer.draw());
				}
			}
			// prepare for redirection.
			RequestDispatcher dispatcher = context
					.getRequestDispatcher("/base.jsp");
			request.setAttribute("title", fragment.title());
			request.setAttribute("pageContents", fragment.contentsJsp());
			request.setAttribute("pageHeader", fragment.headerJsp());
			request.setAttribute("pageFooter", fragment.footerJsp());
			dispatcher.forward(request, response);
		} catch (SoilException e) {
			RequestDispatcher dispacher = context
					.getRequestDispatcher("/error.jsp");
			request.setAttribute("errorMessage", e.getErrorCode()
					.getErrorMessage());
			dispacher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
