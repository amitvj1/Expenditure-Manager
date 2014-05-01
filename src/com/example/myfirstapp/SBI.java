package com.example.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.io.*;
public class SBI extends Activity {

	float t1,e;
	TextView tv1;
	TextView tv2;
	TextView tv3;
	TextView tv4;
	TextView tv5;
	EditText e1;
	EditText e2;
	EditText e3;
	EditText ex;
	public static float x=50000;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sbi);
		tv1 =(TextView)findViewById(R.id.textView1);
		tv2 =(TextView)findViewById(R.id.textView2);
		tv3 =(TextView)findViewById(R.id.textView3);
		tv4 =(TextView)findViewById(R.id.textView4);
		tv5 =(TextView)findViewById(R.id.textView5);
		e1 = (EditText)findViewById(R.id.editText2);
		e2 = (EditText)findViewById(R.id.editText3);
		e3 = (EditText)findViewById(R.id.editText4);
		ex = (EditText)findViewById(R.id.editText1);
		
		readers rdr=new readers();
		x=rdr.getAmt();
		// TODO Auto-generated method stub
					//fv = Math.pow(inter, arg1)
		ex.setText(Float.toString(x));
		e1.setText(rdr.getLastAmt());
		e2.setText(rdr.getLastMerc());
		e3.setText(rdr.getLastDate());
		
	
}
}
