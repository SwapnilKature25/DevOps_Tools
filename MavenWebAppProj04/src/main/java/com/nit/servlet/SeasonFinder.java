package com.nit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/seasonurl")
public class SeasonFinder extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		//get PrintWriter
		PrintWriter pw=res.getWriter();
		
		// set response content type
		res.setContentType("text/html");
		
		// get system Date and Time
		LocalDateTime ldt = LocalDateTime.now();
		
		//get current month value
		int month = ldt.getMonthValue();
		
		//generate the current season name;
		String seasonName = null;
		
		if(month >=3 && month<=6)
		{
			seasonName = "Summer Season";
		}
		else if(month >=7 && month<=10)
		{
			seasonName = "Rainy Season";
		}
		else 
			seasonName = "Winter Season";
		
		// write the results/ output to browser as response
		pw.println("<h1 style='color:green; text-align:center'>"+seasonName+"</h1>");
		
		// add home hyperlink
		pw.println("<a href='index.jsp'>home <img src='images/download.jpg' width='100' height='100'</a>");
		
		// close the stream
		pw.close();
		
	}
	

	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		super.doPost(req, res);	
	}
	
	
	
}
