package com.example.myfirstapp;
import java.io.*;

import android.os.Environment;
public class readers {
	float amt;
	String Amt;
	String merch;
	String date;
	readers()
	{
		amt=0;
		Amt=merch=date="";
	}
	
	public String getLastAmt()
	{
		return Amt;
	}
	public String getLastMerc()
	{
		return merch;
	}
	public String getLastDate()
	{
		return date;
	}
	public float getAmt() {
		// TODO Auto-generated method stub
		try
		{
			FileReader f=new FileReader(Environment.getExternalStorageDirectory().getPath()+"/last.txt");
			BufferedReader b=new BufferedReader(f);
			String s=b.readLine();
			amt=Float.parseFloat(s);
			Amt=b.readLine();
			merch=b.readLine();
			date=b.readLine();
			f.close();
			b.close();
		}
		catch(Exception e)
		{
			amt=0;
			System.out.println("jjghhj");
		}
		return amt;
	}

}
