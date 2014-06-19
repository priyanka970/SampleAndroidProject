package com.sedc.sampleproject;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	EditText edit1;
	TextView tv1;
	Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            
          edit1 = (EditText)findViewById(R.id.enteredtext);
          tv1 = (TextView)findViewById(R.id.yourtext);
          btn = (Button)findViewById(R.id.Clickbtn);
          btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tv1.setText(edit1.getText());
			}
		});
     }
 }


