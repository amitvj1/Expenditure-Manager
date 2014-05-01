package com.example.myfirstapp;

import java.io.BufferedReader;
import java.io.FileReader;

public class AccountDetails {

	public AccountDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public String[][] get_details() 
	{
		String currLine="";
		
		String res[][]= new String[10000][4];
		
		try{
		FileReader f= new FileReader("sms.txt");
		BufferedReader b= new BufferedReader(f);
		int i;
		int j=0;
		
		while((currLine=b.readLine())!=null)
		{
		for(i=0;i<4;i++)
		{
			res[i][j]= currLine;
			currLine=b.readLine();
		}
		j++;
		}
		
		b.close();
		}
		
		catch(Exception e)
		{
			
		}
		
		return res;
		
	}

}
