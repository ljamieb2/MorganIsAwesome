package com.example.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
//test
public class MyFirstAppActivity extends Activity {
	
	private int count;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		final EditText et;
		final Button b;


		et = (EditText) findViewById(R.id.edittext);
		b = (Button) findViewById(R.id.button);
		final TextView rtv = (TextView) findViewById(R.id.responseTextView);
		final String responsearray[] = new String[10];
		
			responsearray[0] = getResources().getString(R.string.response1);
			responsearray[1] = getResources().getString(R.string.response2);
			responsearray[2] = getResources().getString(R.string.response3);
			responsearray[3] = getResources().getString(R.string.response4);
			responsearray[4] = getResources().getString(R.string.response5);
			responsearray[5] = getResources().getString(R.string.response6);
			responsearray[6] = getResources().getString(R.string.response7);
			responsearray[7] = getResources().getString(R.string.response8);
			responsearray[8] = getResources().getString(R.string.response9);
			responsearray[9] = getResources().getString(R.string.response10);
		
		
		b.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				String userText = et.getText().toString();
				if (count==4) {
					rtv.setText(responsearray[count] + " " + et);	
				}
				else
				{rtv.setText(responsearray[count]);}
				
				Log.w("the count", Integer.toString(count));
				count++;

				if (count==10) {
					count=0;
				}
				
				
				Toast msg = Toast.makeText(getBaseContext(), userText,
						Toast.LENGTH_SHORT);
				msg.show();
				
				
				
			}
		});
	}
}