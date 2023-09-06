package com.gmail.lynx7478;


public class Main {
	
	private static N2YO n2yo;

	//args apiKey, NORADId
	public static void main(String[] args) 
	{
		init(args[0], Integer.parseInt(args[1]));
	}
	
	private static void init(String apiKey, int NORADId)
	{
		try {
			n2yo = new N2YO(apiKey, NORADId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
