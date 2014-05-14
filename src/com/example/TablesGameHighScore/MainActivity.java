package com.example.TablesGameHighScore;



import com.example.sums101.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

	public static final String EXTRA_MESSAGE = "MESSAGE";


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	 public void sendMessage(View sender) {
	    	Intent intent = new Intent(this, SumMachine.class);
	    	Button bt = (Button)sender;
	    	String numb = bt.getText().toString();
	    	intent.putExtra(EXTRA_MESSAGE, numb);
	    	startActivity(intent);
	    }

}
