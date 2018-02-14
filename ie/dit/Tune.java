package ie.dit;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileReader;

public class Tune
{

	private int x;	
	private String title;
	private String altTitle;
	private String notation;

	public int x()
	{
		return x;
	}
	public String title()
	{
		return title;	
	}
	public String altTitle()
	{
		return altTitle;
	}
	public String notation()
	{	
		return notation;
	}

	public String toString()
	{
		StringBuffer sb= new StringBuffer();
		for(int x : x)
		{
			sb.append(x, title, altTitle);
		}
		return sb.toString();
	}


}