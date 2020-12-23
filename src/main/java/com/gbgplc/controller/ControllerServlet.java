package com.gbgplc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerServlet extends HttpServlet {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			doGet(req,resp);
		} catch (Exception e) {
			Logger.getGlobal().log(Level.WARNING, "Issues in DoPost");
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		try {
			PrintWriter out = resp.getWriter();
		    out.println("OK");		    
		} catch (Exception e) {
			Logger.getGlobal().log(Level.WARNING, "Issues in DoGet");
		}
	}
	
}
