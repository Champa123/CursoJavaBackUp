<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	String numero1 = request.getParameter("campo1");
	String numero2 = request.getParameter("campo2");
	int num1 = Integer.parseInt(numero1);
	int num2 = Integer.parseInt(numero2);
	int total= num1 + num2;
	
%>
el total es <%= total %>