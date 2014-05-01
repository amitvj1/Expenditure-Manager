package com.example.myfirstapp;


import java.io.BufferedReader;
import java.io.FileReader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;
import android.util.Log;
import android.widget.Toast;

public class IncomingSms extends BroadcastReceiver {
    
    // Get the object of SmsManager
	//Parser ob = new Parser();
    final SmsManager sms = SmsManager.getDefault();
     String msg="";
    public void onReceive(Context context, Intent intent) {
     
        // Retrieves a map of extended data from the intent.
        final Bundle bundle = intent.getExtras();
        try {
             
            if (bundle != null) {
                 
                final Object[] pdusObj = (Object[]) bundle.get("pdus");
                 
                for (int i = 0; i < pdusObj.length; i++) {
                	System.out.println("ex1");
                    SmsMessage currentMessage = SmsMessage.createFromPdu((byte[]) pdusObj[i]);
                    String phoneNumber = currentMessage.getDisplayOriginatingAddress();
                     
                    String senderNum = phoneNumber;
                    String message = currentMessage.getDisplayMessageBody();
 
                    Log.i("SmsReceiver", "senderNum: "+ senderNum + "; message: " + message);
                     
 
                   // Show Alert
                    int duration = Toast.LENGTH_LONG;
                   Toast toast = Toast.makeText(context, 
                                 "senderNum: "+ senderNum + ", message: " + message, duration);
                    this.msg=message;
                    toast.show();
                    //int a = ob.mess();
                    //System.out.println("The parsed message is:"+a);
                    
                    
                    
                     
                } // end for loop
                System.out.println("ex2");
                String curLine="";
                String ss= msg.substring(msg.indexOf("Card")+5, msg.indexOf("is")-3);
                int flag=0;
                String s[]= new String[4];
                try{
                	System.out.println("ex3");
                FileReader f= new FileReader("bank.txt");
                BufferedReader b= new BufferedReader(f);
                
                while((curLine=b.readLine())!=null){
                	
                	if(curLine.equals(ss)){
                		System.out.println("ex4");
                		curLine=b.readLine();flag=1; break;
                	}
                	else
                		curLine=b.readLine();
                	
                }
                b.close();
                
                }
                
                catch(Exception e){
                	
                }
                
                
                if(flag==1){
                	s[3]=curLine;
                }
                
                System.out.println("ex5");
                s[0]= msg.substring(msg.indexOf("at")+3,msg.indexOf("on"));System.out.println("ex6");
                s[1]=msg.substring(msg.indexOf("INR")+4,msg.indexOf("using")-1);System.out.println("ex7");
                s[2]=msg.substring(msg.indexOf("on")+4,msg.indexOf("Avbl")-1);System.out.println("ex8");
                                
                
               FileStorage f= new FileStorage();
               
                f.set_data(s);
                
              } // bundle is null
 
        } catch (Exception e){
            Log.e("SmsReceiver", "Exception smsReceiver" +e);
             
        }
        
        
    }    
}
