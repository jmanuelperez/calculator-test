package com.gbgplc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerServlet extends HttpServlet {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String response;	
	
	
	@Override
	public void init() throws ServletException {		
		super.init();		
	}



	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int max = 30000;
		int min = 5000;
		try {
			Thread.sleep(getRandomDelay(min, max));
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
		
		resp.setContentType("text/xml");
		
		PrintWriter out = resp.getWriter();
	    out.println(response);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
	    out.println("OK");
	}
	
	/**
	 * Generates a random integer between 10000 and 30000
	 * @return
	 */
	private long getRandomDelay(int min, int max) {		
		Random r = new Random();
		return r.nextInt((max-min) + 1) + min;
	}
	
}
