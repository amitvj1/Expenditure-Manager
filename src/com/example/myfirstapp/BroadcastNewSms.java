package com.example.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BroadcastNewSms extends Activity {

	int counter;
	Button send;
	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.broadcast);
		send = (Button) findViewById(R.id.button1);
		tv = (TextView) findViewById(R.id.textView1); 
		send.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tv.setText("You are in broadcast receiver class!");
				//Intent openMainActivity = new Intent("com.example.myfirstapp.Menu");
				//startActivity(openMainActivity);
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}