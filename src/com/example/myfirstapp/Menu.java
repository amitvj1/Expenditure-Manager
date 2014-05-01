package com.example.myfirstapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity{
	int position;
	String classes[] = {"MainActivity","FutureInvest","Annuity","BroadcastNewSms","Accounts"};
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1,classes));
	}
	protected void onListItemClick(ListView l,View v,int position,long id)
	{
		super.onListItemClick(l, v, position, id);
		String pos = classes[position];
		try
		{
		Class c =Class.forName("com.example.myfirstapp."+pos);
		Intent in = new Intent(Menu.this,c);
		startActivity(in);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}

	
}
