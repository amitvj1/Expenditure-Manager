package com.example.myfirstapp;

import java.io.*;

import android.os.Environment;
public class FileStorage {

	public FileStorage() {
		// TODO Auto-generated constructor stub
	}
	
	public void set_data(String[] entry) throws IOException
	{
		
		FileWriter f= new FileWriter(Environment.getExternalStorageDirectory().getPath()+"/sms.txt",true);
		BufferedWriter b= new BufferedWriter(f);
		float amt;
		PrintWriter p= new PrintWriter(b);
		try
		{
			FileReader fr=new FileReader(Environment.getExternalStorageDirectory().getPath()+"/last.txt");
			BufferedReader br=new BufferedReader(fr);
			String s=br.readLine();
			
			amt=Float.parseFloat(s);
			float newBal=0;
			float diff =Float.parseFloat(entry[1]);
			newBal=amt-diff;
			System.out.println("ex3");
			for(int i=0;i<entry.length;i++)
			{
				p.println(entry[i]);
				System.out.println("ex3");
			}
			br.close();
			p.close();
			FileWriter fw= new FileWriter(Environment.getExternalStorageDirectory().getPath()+"/last.txt");
			BufferedWriter bw= new BufferedWriter(fw);
			PrintWriter pw= new PrintWriter(bw);
			System.out.println("ex1");
			pw.println(newBal);
			pw.println(entry[1]);
			pw.println(entry[0]);
			pw.println(entry[2]);
			pw.close();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		
	}
}
		
		
	
	

