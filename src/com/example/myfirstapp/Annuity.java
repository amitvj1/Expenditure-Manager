package com.example.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Annuity extends Activity{
	
	double rate,pvifa,fvifa,noy;
	Button fv;
	Button pv;
	TextView display;
	EditText rat;
	EditText n;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.annu);
			
		fv = (Button)findViewById(R.id.button1);
		pv = (Button)findViewById(R.id.button2);
		display = (TextView)findViewById(R.id.textView2);
		rat = (EditText)findViewById(R.id.editText1);
		n = (EditText)findViewById(R.id.editText2);
		pv.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
							//fv = Math.pow(inter, arg1)
				rate = Float.valueOf(rat.getText().toString()); 
				noy = Float.valueOf(n.getText().toString()); 
				pv.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						pvifa = (((Math.pow(1+rate, noy))-1)/((rate)*Math.pow(1+rate, noy)));
						
						display.setText("The present value of interest factor of Annuity is:"+pvifa);
					}
				});
				
				fv.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						fvifa = (((Math.pow(rate, noy))+1)/(rate));
						
						display.setText("The future value of interest factor of Annuity is:"+fvifa);
					}
				});
				
		
			}
	});
	}
}




