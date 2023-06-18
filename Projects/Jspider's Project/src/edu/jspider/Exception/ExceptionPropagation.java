package edu.jspider.Exception;

import java.sql.SQLException;

public class ExceptionPropagation {

	private static void m1()throws SQLException
	{
		m2();
	}
	
	private static void m2()throws SQLException
	{
		m3();
	}
	
	private static void m3()throws SQLException
	{
		m4();
	}
	private static void m4()throws SQLException
	{
		throw new SQLException();
	}
	
	public static void main(String[] args) throws SQLException {
		try
		{
			m1();
		}
		catch(SQLException arg)
		{
			System.out.println(arg.getMessage());
		}
	}

}
