package com.depoylmentApp.main;

import java.io.IOException;
import java.net.Inet4Address;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class controller
 */
@WebServlet("/*")
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see
     */
    public controller() {
        super();
        // TODO Auto-generated constructor stub.
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String hostname = Inet4Address.getLocalHost().getHostName();
		String ipAddress = Inet4Address.getLocalHost().getHostAddress();
		String appVersion = "2.6";
		response.getWriter().write("<html><body> App Version = " + appVersion 
				+"</br> Hostname = " + hostname 
				+"</br> IP = " + ipAddress 
				+ "</body></html>");
	}

}
