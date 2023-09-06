package com.gmail.lynx7478;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class N2YO 
{
	
	private int NORADId;
	
	private String apiKey;
	
	private HashMap<Integer, Integer> passes;
	
	private String lat;
	private String lon;
	
	private double frec;
	
	private String json;
	
	public N2YO(String apiKey, int NORADId)
	{
		this.apiKey=apiKey;
		this.NORADId=NORADId;
		
		this.json=grabJson();
	}
	
	public int getNORADId()
	{
		return NORADId;
	}
	
	public String grabJson()
	{
		//TODO: Change this. For testing purposes URL is set to grab TLE.
		String sUrl = "https://api.n2yo.com/rest/v1/satellite/tle/"+NORADId+"&apiKey="+apiKey;
		
		URL url = null;
		try {
			url = new URL(sUrl);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		if(url == null)
		{
			System.out.println("Everything broke");
			return null;
		}
		
		try (InputStream input = url.openStream()) 
		{
	        InputStreamReader isr = new InputStreamReader(input);
	        BufferedReader reader = new BufferedReader(isr);
	        StringBuilder pjson = new StringBuilder();
	        int c;
	        while ((c = reader.read()) != -1) 
	        {
	            pjson.append((char) c);
	        }
	        
	        return pjson.toString();
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sUrl;
		
	}
	
	public HashMap<Integer, Integer> grabPasses()
	{
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		
		return hash;
	}
	
	public HashMap<Integer, Integer> getPasses()
	{
		return passes;
	}
	
	public String getLat()
	{
		return lat;
	}
	
	public String getLon()
	{
		return lon;
	}
	
	public double getFrec()
	{
		return frec;
	}
	
	public String getJson()
	{
		return json;
	}

}
