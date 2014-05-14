package com.example.TablesGameHighScore;

import com.example.sums101.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SumMachine extends Activity {

	public static final String EXTRA_MESSAGE2 = "MESSAGE2";
	public static final String EXTRA_MESSAGE4 = "MESSAGE24";

		
	TextView textv1;
	TextView messageM;
	EditText eText1;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sum_machine);
		textv1 = (TextView)findViewById(R.id.textViewTable);
		
		Intent intent = getIntent();
		String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
		
		textv1.setText(message);
			
	}
	
	public void sendMessage2(View sender) {
    	Intent intent = new Intent(this, SumMachinePart2.class);
    	Button bt = (Button)sender;
    	String numb = bt.getText().toString();
    	messageM = (TextView)findViewById(R.id.textViewTable);
    	String message2 = messageM.getText().toString();
    	intent.putExtra(EXTRA_MESSAGE2, numb);
    	intent.putExtra(EXTRA_MESSAGE4, message2);
    	startActivity(intent);
    }



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sum_machine, menu);
		return true;
	}

}
