package com.example.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FutureInvest extends Activity{
	
	double fv=0,cv=0,dp=0;
	double rate=0,inter=0;
	double noy,reinvest;
	Button fi;
	TextView display1;
	TextView display2;
	EditText pv;
	EditText rat;
	EditText m;
	EditText n;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.futinv);
		
		fi = (Button)findViewById(R.id.button1);
		display1 = (TextView)findViewById(R.id.textView3);
		display2 = (TextView)findViewById(R.id.textView6);
		pv = (EditText)findViewById(R.id.editText1);
		rat = (EditText)findViewById(R.id.editText2);
		m = (EditText)findViewById(R.id.editText4);
		n = (EditText)findViewById(R.id.editText3);
		fi.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
							//fv = Math.pow(inter, arg1)	 
				cv = Float.valueOf(pv.getText().toString()); 
				rate = Float.valueOf(rat.getText().toString()); 
				//noy = n.getAlpha();
				noy = Float.valueOf(n.getText().toString()); 
				reinvest = Float.valueOf(m.getText().toString()); 
				inter = (1+(rate/reinvest));
				fi.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
					
						fv = Math.pow(inter, (noy*reinvest));
						dp = 72/rate;
						display1.setText("The value of your investment after"+noy+"years is:"+fv);
						display2.setText("The approximate doubling period is:"+dp);
					}
				});
				
		
			}
	});
	}
}
